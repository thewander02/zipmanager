import javax.swing.JOptionPane;

public class feetToMiles {

	public static void main(String[] args) {
		final double conversionAmount = 5280.0;
		double milesToUnclesHouse = 8.5;
		
		JOptionPane.showMessageDialog(null,  "The distance to my uncle\'s house is "+milesToUnclesHouse+" or "+(milesToUnclesHouse*conversionAmount)+" feet.");

	}

}
