import javax.swing.JOptionPane;

public class FeetToMiles 
{

	public static void main(String[] args) 
	{
		double feetInMile = 5280;
		double milesAway = 11.3;
		
		JOptionPane.showMessageDialog(null, "My uncles house is " + milesAway + " miles away and " + (int)( milesAway * feetInMile )+ " feet away");
	}

}
