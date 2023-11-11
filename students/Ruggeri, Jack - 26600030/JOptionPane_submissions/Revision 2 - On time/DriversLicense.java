import javax.swing.JOptionPane;

public class DriversLicense 
{

	public static void main(String[] args) 
	{
		String firstName = "";
		int age = 0;
		int monthNumber = 0;
		final int LEGAL_AGE = 16;
		firstName = JOptionPane.showInputDialog("Enter your first name");
		//System.out.println("First Name: " + firstName);
		age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		//System.out.println("Age: "  + age);
		monthNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter your month of birth as a number"));
		//System.out.println("Month: "  + monthNumber);
		if (age >= 16) {
			JOptionPane.showMessageDialog(null, firstName +  " can apply for a licence!");

		}
		
		else if (age < LEGAL_AGE)  {
			if (16 - age != 1) {
				if (monthNumber < 8 ) {
				//System.out.println(firstName + " can apply for a license in about " + (15-age) + " years and " + (12 - (8 - monthNumber)) + " months!" ); 
					JOptionPane.showMessageDialog(null, firstName +  " can apply for a licence in about "+ (15-age) + " years and " + (12 - (8 - monthNumber)) + " months!");
				}
				else {
				//System.out.println(firstName + " can apply for a license in about " + (16-age) + " years and " + (monthNumber - 8) + " months!"); 
					JOptionPane.showMessageDialog(null, firstName + " can apply for a license in about " + (16-age) + " years and " + (monthNumber - 8) + " months!");
				}
			}
			else{
				//System.out.println(firstName + " can apply for a license in about " + (monthNumber - 8) + " months!");
				JOptionPane.showMessageDialog(null, firstName + " can apply for a license in about " + (monthNumber - 8) + " months!");
			}
		} 
	}

}
