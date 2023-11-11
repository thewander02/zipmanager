import javax.swing.JOptionPane;
public class MadLibs {

	public static void main(String[] args)
	{
		String word1 = "";
		String word2 = "";
		String word3 = " ";
		String word4 = "";
		String word5 = "";

		word1 = JOptionPane.showInputDialog("Put a location");

		word2 = JOptionPane.showInputDialog("Put a adjective");
		word3 += JOptionPane.showInputDialog("Put a location");
		
		word4 = JOptionPane.showInputDialog("Put a movement verb");
		word5 = JOptionPane.showInputDialog("Put an aspect of the body");
		JOptionPane.showMessageDialog(null, "Back in "+ word1 + " a wonderful "
				 + word2 + word3 + " was " + word4 + " around, demonstrating that it does have a single care in it's " + word5);
	}

}
