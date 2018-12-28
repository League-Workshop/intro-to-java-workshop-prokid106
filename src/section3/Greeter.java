package section3;

import javax.swing.JOptionPane;

public class 3 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "hi, " + name);
		String emotion = JOptionPane.showInputDialog("how are you doing today?");
				JOptionPane.showInputDialog("why are you feeling " + emotion);
				
	}
}