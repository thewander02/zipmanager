# Imports
import inquirer
import subprocess
import os
import time

from art import *
from zipfile import ZipFile
from shutil import *

# Manage downloaded schoology assignments

def clearscreen():
    subprocess.Popen("cls", shell=True).communicate()

clearscreen()
tprint("Assignment Manager",font="cybermedum")

if not os.path.exists('files'):
    os.mkdir('files')
    print("[OS-MKDIR] files")
files = ['files/' + f for f in os.listdir('files') if f.endswith('.zip')]

questions = [
    inquirer.List('Files',
        message='What zip do you want to work with?',
        choices=files,
    ),
]

selected_zip = inquirer.prompt(questions)['Files']
# create a folder for each student in the /student dir and make a folder that is the same name as the original zip then put the revisions in that folder that are unziped
clearscreen()
if not os.path.exists('students'):
    os.mkdir('students')
    print("[OS-MKDIR] students")
if not os.path.exists('temp'):
    os.mkdir('temp')
    print("[OS-MKDIR] temp")
with open(selected_zip) as f:
    with ZipFile(selected_zip, 'r') as zipObj:
        zipObj.extractall('temp/' + selected_zip.split('/')[1].split('.')[0])

    for student in os.listdir('temp/' + selected_zip.split('/')[1].split('.')[0]):
        if not os.path.exists('students/' + student):
            os.mkdir('students/' + student)
            print("[OS-MKDIR] students/" + student)

        assignment = selected_zip.strip('files').strip('.zip')
        if not os.path.exists('students/' + student + assignment):
            os.mkdir('students/' + student + assignment)
            print("[OS-MKDIR] students/" + student + assignment)
        
        for files in os.listdir('temp/' + selected_zip.split('/')[1].split('.')[0] + '/' + student):
            # Take the most recent revision and put its files in the assignment folder
            path = 'temp/' + selected_zip.split('/')[1].split('.')[0] + '/' + student + '/' + files
            newpath = 'students/' + student + assignment + '/' + files
            if not os.path.exists(newpath):
                os.rename(path, newpath)
                print("[OS-RENAME] " + path + ' -> ' + newpath)
            for zips in os.listdir(newpath):
                if zips.endswith('.zip'):
                    with ZipFile(newpath + '/' + zips, 'r') as zipObj:
                        zipObj.extractall(newpath)
                    os.remove(newpath + '/' + zips)
                # strip sufix and check if their is duplicate revision folders
                # if their is duplicate revision folders then remove the one without the sufix
                # if their is no duplicate revision folders then do nothing
                
                # for student in os.listdir('students'):
                #     student_path = os.path.join('students', student)
                #     assignments = os.listdir(student_path)
                #     assignment_set = set()

                #     for assignment in assignments:
                #         assignment_name, _, _ = assignment.rpartition(' [Viewed ')
                #         assignment_set.add(assignment_name)

                #     for assignment_name in assignment_set:
                #         duplicates = [a for a in assignments if a.startswith(assignment_name + ' [Viewed ') and a.endswith('x]')]
                #         if len(duplicates) > 1:
                #             for duplicate in duplicates[:-1]:
                #                 duplicate_path = os.path.join(student_path, duplicate)
                #                 print(f"[OS-REMOVE] {duplicate_path}")
                #                 rmtree(duplicate_path)
tprint("Files Extracted")
for root, dirs, files in os.walk('temp'):
    for file in files:
        os.remove(os.path.join(root, file))
    for dir in dirs:
        rmtree(os.path.join(root, dir))
time.sleep(2)
while True:
    time.sleep(1)
    clearscreen()
    tprint("Student Manager",font="cybermedum")
    students = ['students/' + f for f in os.listdir('students')]

    questions = [
        inquirer.List('Student Selector',
            message='What student do you want to select?',
            choices=students,
        ),
    ]

    selected_student = inquirer.prompt(questions)['Student Selector']


    questions = [
        inquirer.List('Actions',
            message='What action do you want to preform',
            choices={'View Assigments'},
        ),
    ]

    selected_action = inquirer.prompt(questions)['Actions']

    match selected_action:
        case 'View Assigments':
            clearscreen()
            tprint("Student Manager",font="cybermedum")
            assignments = [f for f in os.listdir(selected_student)]
            questions = [
                inquirer.List('Assignment Selector',
                    message='What assignment do you want to select?',
                    choices=assignments,
                ),
            ]

            selected_assignment = inquirer.prompt(questions)['Assignment Selector']
            clearscreen()
            tprint("Student Manager",font="cybermedum")
            revisions = [f for f in os.listdir(selected_student + '/' + selected_assignment)]
            questions = [
                inquirer.List('Revision Selector',
                    message='What revision do you want to select?',
                    choices=revisions,
                ),
            ]

            selected_revision = inquirer.prompt(questions)['Revision Selector']
            clearscreen()
            tprint("Student Manager", font="cybermedium")
            print("Opening Assignment")
            file = os.path.join(selected_student, selected_assignment, selected_revision)
            os.startfile(file)

        # Check if the file has been viewed before
        # if '[Viewed ' in selected_revision:
        #     # Get the number of times it has been viewed
        #     start = selected_revision.find('[Viewed ') + len('[Viewed ')
        #     end = selected_revision.find('x]', start)
        #     times = int(selected_revision[start:end])

        #     # Add one to the number
        #     times += 1

        #     # Rename the file
        #     new_revision = selected_revision[:start - len('[Viewed ')] + f'[Viewed {times}x]' + selected_revision[end + len('x]'):]
        #     os.rename(os.path.join(selected_student, selected_assignment, selected_revision), os.path.join(selected_student, selected_assignment, new_revision))

        #     # Open the file
        #     os.startfile(os.path.join(selected_student, selected_assignment, new_revision))

        #     # Remove the old file without the "Viewed" tag
        #     if os.path.exists(os.path.join(selected_student, selected_assignment, selected_revision)):
        #         os.remove(os.path.join(selected_student, selected_assignment, selected_revision))
        # else:
        #     # Add '[Viewed 1x]' to the end of the file
        #     new_revision = f'{selected_revision} [Viewed 1x]'
        #     os.rename(os.path.join(selected_student, selected_assignment, selected_revision), os.path.join(selected_student, selected_assignment, new_revision))

        #     # Open the file
        #     os.startfile(os.path.join(selected_student, selected_assignment, new_revision))