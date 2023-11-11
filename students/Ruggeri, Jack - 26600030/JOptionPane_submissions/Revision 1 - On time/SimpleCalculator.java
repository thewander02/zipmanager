import javax.swing.JOptionPane;
import java.text.*;
public class SimpleCalculator 
{

	public static void main(String[] args) 
	{
		double num1 = 0;
		double num2 = 0;
		
		String[] options = { "Add", "Subtract", "Multiply", "Divide" };
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a number(can have decimals)"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter a second number(can have decimals)"));
		DecimalFormat df = new DecimalFormat("#.##");
		//df.format()
		int selection = JOptionPane.showOptionDialog(null, "Select an operation: ", "Calculator", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		//System.out.println(selection); (debugging) 
		/*int x = JOptionPane.showOptionDialog(null, "Returns the position of your choice on the array",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        System.out.println(x);*/
		switch (selection) {
		case 0: JOptionPane.showMessageDialog(null, df.format(num1+num2));
				break;
		case 1: if (num1>num2){
			JOptionPane.showMessageDialog(null, df.format(num1-num2));
				break;
			}
		else {
			JOptionPane.showMessageDialog(null, df.format(num2-num1));
				break;
			}
			
		case 2: JOptionPane.showMessageDialog(null, df.format(num1*num2));
				break;
		case 3: if (num1>num2){
			JOptionPane.showMessageDialog(null, df.format(num1/num2));
				break;
			}
			else {
			JOptionPane.showMessageDialog(null, df.format(num2/num1));
				break;
			}
		}
		
		/*
		if (num1 > num2) {
			
		
		JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (df.format(num1+num2)) +"\n"+
				num1 + " * " + num2 + " = " + (df.format(num1*num2)) +"\n"+ 
				num1 + " - " + num2 + " = " + (df.format(num1-num2)) +"\n"+
				num1 + " / " + num2 + " = " + (df.format(num1/num2)));
						}
		else {
			JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (df.format(num1+num2)) +"\n"+
					num1 + " * " + num2 + " = " + (df.format(num1*num2)) +"\n"+ 
					num2 + " - " + num1 + " = " + (df.format(num2-num1)) +"\n"+
					num2 + " / " + num1 + " = " + (df.format(num2/num1)));
		}
		*/
	}
		

}
