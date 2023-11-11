import javax.swing.JOptionPane;
public class MadLib 
{

	public static void main(String[] args) 
	{
		String one = "";
		String two = "";
		String three = "";
		String four = "";
		
		one = JOptionPane.showInputDialog("Give an object");
		two = JOptionPane.showInputDialog("Give another object");
		three = JOptionPane.showInputDialog("Give an adjective");
		four = JOptionPane.showInputDialog("Give an verb in the past tense");
		
		JOptionPane.showMessageDialog(null, "Mary had a little " + one + "\nIts " + two + " was "
				+ three + " as snow\nAnd everywhere that Mary " + four + "\nThe " + one +
				" was sure to go.");
	}

}
