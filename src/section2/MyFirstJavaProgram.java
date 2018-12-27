package section2;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
String word = JOptionPane.showInputDialog("spell: pneumonoultramicroscopicsilicovolcanoconiosis");
		if (word.equalsIgnoreCase("pneumonoultramicroscopicsilicovolcanoconiosiS")) {
			JOptionPane.showMessageDialog(null, "that is correct, good job!");
		} else { JOptionPane.showMessageDialog(null,"incorrect!" );
}
}
	}

