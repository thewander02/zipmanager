import javax.swing.JOptionPane;
public class MileConvert 
{

	public static void main(String[] args) 
	{
		int constant = 5280;
		double dist = 10;
		JOptionPane.showMessageDialog(null, "The distance to my uncle's house is " + dist + " miles or "
				+ (dist * constant) + " feet.");
	}

}
