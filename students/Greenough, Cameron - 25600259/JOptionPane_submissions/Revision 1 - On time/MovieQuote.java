import javax.swing.JOptionPane;
public class MovieQuote 
{

	public static void main(String[] args) 
	{
		String firstName = "";
		String lastName = "";
		String input = "";
		
		firstName = JOptionPane.showInputDialog("Enter your first name");
		lastName = JOptionPane.showInputDialog("Enter your last name");
		input = JOptionPane.showInputDialog("What is your favourite movie quote?");
		JOptionPane.showMessageDialog(null, "First name: " + firstName + "\nLast name: " + lastName + "\nFavoutite quote: " + input);
	}

}
