import javax.swing.JOptionPane;

public class driversLicense {

	public static void main(String[] args) {
		String firstName = JOptionPane.showInputDialog("Enter your first name: ");
		String age = JOptionPane.showInputDialog("Enter your age: ");
		int ageInt = Integer.parseInt(age, 10);
		if (16-ageInt==1) {
			System.out.println(firstName+" has to wait 1 year");
		}
		else if (ageInt>=16) {
			System.out.println(firstName+" has to wait 0 years");
		}
		else {
			System.out.println(firstName+" has to wait "+ (16-ageInt)+" years");
		}
	}

}
