import javax.swing.JOptionPane;
public class calcultor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		String input = "";
		int y = 0;
		String cool = "";
		cool = JOptionPane.showInputDialog("What is the value of x");
		input = JOptionPane.showInputDialog("What is y");
		x = Integer.parseInt(cool);
		y = Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, "y * x = " + (y*x) + " \n y+x = " + (y+x) + "\n y - x = " + (y-x) + "\n y/x = " + ((double)y/(double)x));
	}

}
