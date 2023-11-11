import javax.swing.JOptionPane;
public class milesTofeet 
{
	public static void main(String[] args) 
	{
		final double feetInAMile = 5280;
		String x = "";
		double feet = 5;
		String input = "";
		double y = 1.0;

		input = JOptionPane.showInputDialog("How many miles in you distance to you uncle's house");
		feet = Double. parseDouble(input) ;
		feet = (double) (feet / 1.0);
		y = feet * feetInAMile;
		JOptionPane.showMessageDialog(null, "The Feet to your uncle's house: " + feet + " Your miles in feet: " + (feet * feetInAMile));
		
			
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
