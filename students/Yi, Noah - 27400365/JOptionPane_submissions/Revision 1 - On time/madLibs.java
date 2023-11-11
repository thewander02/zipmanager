import javax.swing.JOptionPane;
public class madLibs 
{

	public static void main(String[] args) 
	{
		String noun = "";
		String verb = "";
		String adjective = "";
		String name = "";
		System.out.println(" Hello my name is (Insert Name Here) and my favorite thing is (Insert noun here) and I like it because it is very (Insert adjective here)");
		name = JOptionPane.showInputDialog("What is your Name");
		noun = JOptionPane.showInputDialog("What is your favorite thing");
		verb = JOptionPane.showInputDialog("What is your favorite to do ");
		adjective = JOptionPane.showInputDialog(" How do you describe that thing");
		JOptionPane.showMessageDialog(null," Hello my name is " + name + " \n and my favorite thing is " + noun + " and I like it because it is very " + adjective );
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
