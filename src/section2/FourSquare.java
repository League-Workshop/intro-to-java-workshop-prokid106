package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot R = new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
R.setSpeed(101);
		// 5. Set the pen width to 5
R.setPenWidth(1);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
for (int i = 0; i<20000; i++) {
			// 7. Set the pen color to random
	R.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
R.turn(90);
}
R.move(200);
	}

	
	void drawSquare() {
		//JOptionPane.showMessageDialog(null, "this message is stupid!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for (int i = 0; i<4; i++) {
			R.penDown();
			R.move(30);
			R.turn(20);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



