import javax.swing.JOptionPane;

public class madLib {

	public static void main(String[] args) {
		String[] poem = new String[]{"Jack and Jill went up the ", " to fetch a ", " of ", " \nJack fell down and broke his ", " \nAnd Jill came tubling after"};
		String word1 = JOptionPane.showInputDialog("Enter a word: ");
		String word2 = JOptionPane.showInputDialog("Enter another word: ");
		String word3 = JOptionPane.showInputDialog("Enter a third word: ");
		String word4 = JOptionPane.showInputDialog("Enter a fourth word: ");
		
		System.out.println(poem.length);
		String newPoem = poem[0]+word1+poem[1]+word2+poem[2]+word3+poem[3]+word4+poem[4];
		JOptionPane.showMessageDialog(null, newPoem);
	}

}
