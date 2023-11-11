import javax.swing.JOptionPane;
public class driver_License 
{

	public static void main(String[] args) 
	{
	String firstName = "se";
	int Ag = 100000;
	String input = "rf";
	
	firstName = JOptionPane.showInputDialog("What is your first name");
	input = JOptionPane.showInputDialog("How old are you");
	Ag = Integer.parseInt(input);
	if (Ag < 18){
	
	JOptionPane.showMessageDialog(null, "Hello " + firstName + " there are " + (18 - Ag) + " years until you can get your license");
	
	
	
		// TODO Auto-generated method stub

	}
	if (Ag > 18 ) {
		
	
	JOptionPane.showMessageDialog(null, "Hello " + firstName + " there are no more years until yu can get your license");
	}
	}
}