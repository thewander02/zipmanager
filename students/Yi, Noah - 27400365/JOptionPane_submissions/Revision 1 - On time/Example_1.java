

import javax.swing.JOptionPane;
public class Example_1 
{

	public static void main(String[] args) 
	{
		String firstName = "";
		String lastName = "";
		String movieQuote = "";
		String Author = "";
		firstName = JOptionPane.showInputDialog("What is your first name");
		lastName = JOptionPane.showInputDialog("What is your lastname");
		movieQuote = JOptionPane.showInputDialog("What is your favorite movie quote");
		Author = JOptionPane.showInputDialog("Who said that line");
		
		JOptionPane.showMessageDialog(null,"Your name is " + firstName + " " + lastName + " \n Your favorite movie quote is " + movieQuote + " \n The person who said it was " + Author);
		// TODO Auto-generated method stub

	}

}
