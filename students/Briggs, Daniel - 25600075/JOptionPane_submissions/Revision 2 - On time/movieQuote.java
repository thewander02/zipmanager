import javax.swing.JOptionPane;

public class movieQuote {

	public static void main(String[] args) {
		String firstName = JOptionPane.showInputDialog("Enter your first name: ");
		String lastName=JOptionPane.showInputDialog("Enter your last name: ");
		String movieQuote=JOptionPane.showInputDialog("Enter your favorite movie quote: ");
		String author = JOptionPane.showInputDialog("Enter the author of your movie quote: ");
		
		JOptionPane.showMessageDialog(null, firstName+" "+lastName+"\'s favorite movie quote is: "+movieQuote+" by "+author);
	}
//for some reason when running this program either eclipse freezes or it never launches
}
