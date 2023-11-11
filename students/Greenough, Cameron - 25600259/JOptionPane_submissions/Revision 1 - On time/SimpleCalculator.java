import javax.swing.JOptionPane;
public class SimpleCalculator {

	public static void main(String[] args) {
		double one = 0;
		double two = 0;
		one = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
		two = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number"));
		JOptionPane.showMessageDialog(null, one + "+" + two + "=" + (one+two) + "\n" + one + "*" + two 
				+ "=" + (one*two)+ "\n" + one + "-" + two + "=" + (one-two) + "\n" + one + "/" 
				+ two + "=" + (one/two));
	}

}
