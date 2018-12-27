package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot R = new Robot();
		// 5. Set your robot's pen down 
		R.penDown();
		// 3. Set the robot to go at max speed (100)
		R.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i = 0; i<3000; i++) {
			// 7. Change the pen color to random
		R.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
			R.move(5*i);
			// 2. Turn the robot 360/7 degrees to the right
		R.turn(360/7);
			// 8. Set the pen width to i
		R.setPenWidth(i);
		}
		R.move(100);
	}
}
