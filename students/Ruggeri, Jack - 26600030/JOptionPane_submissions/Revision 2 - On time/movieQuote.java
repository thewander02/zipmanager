import javax.swing.JOptionPane;

public class movieQuote 
{

	public static void main(String[] args)
	{
		String firstName = "";
		String lastName = "";
		String quote = "";
		String author = "";
		
		firstName = JOptionPane.showInputDialog("What is your first name");
		lastName = JOptionPane.showInputDialog("What is your last name");
		quote = JOptionPane.showInputDialog("What is your favorite quote?");
		author = JOptionPane.showInputDialog("What is the author's name?");
		JOptionPane.showMessageDialog(null,"First name: " + firstName +  "\nLast name: " + lastName + 
				"\nFavorite quote: \"" + quote + "\"(" + author + ").");
	}

}
