import javax.swing.JOptionPane;
public class DriversLicense 
{

	public static void main(String[] args) 
	{
		String firstName = "";
		int age = 0;
		
		firstName = JOptionPane.showInputDialog("Enter your first name");
		age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, firstName + ", you need to wait " + (16 - age) + " years to get your license");
	}

}
