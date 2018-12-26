package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot boredbot = new Robot();
	boredbot.setPenColor(Color.CYAN);
	boredbot.penDown();
	boredbot.setSpeed(200);
	for (int i = 0; i <4; i++) {
	boredbot.setRandomPenColor();
	boredbot.setPenWidth(5);
	boredbot.move(200);
	boredbot.turn(90);
	}
	boredbot.move(100);
	boredbot.turn(90);
	boredbot.move(200);
	boredbot.turn(-90);
	boredbot.move(100);
	boredbot.turn(-90);
	boredbot.move(100);
	boredbot.turn(-90);
	boredbot.move(200);
	boredbot.penUp();
	boredbot.move(200);
	boredbot.turn(180);
	}
}
