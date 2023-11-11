import javax.swing.JOptionPane;

public class simpleCalculator {
	public static void main(String[] args) {
		double num1=Double.parseDouble(JOptionPane.showInputDialog("Please enter a number: "));
		double num2=Double.parseDouble(JOptionPane.showInputDialog("Please enter another number: "));

		JOptionPane.showMessageDialog(null, "Sum: "+(num1+num2)+"\nDiffrence: "+(num1-num2)+"\nProduct: "+(num1*num2)+"\nQuotient: "+(num1/num2));
	}
}
