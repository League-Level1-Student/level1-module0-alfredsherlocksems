package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot(90, 400);
	public void run() {

	Random ran = new Random();	
	int height =	ran.nextInt(101);
	drawHouse(100);
	for (int i = 0; i < 9; i++) {		
drawHouse(height);
}
	
	
	
	
	
	
	}
	
void drawHouse(int height) {
	rob.setSpeed(30);
	rob.penDown();
	rob.move(height);
	rob.turn(90);
	rob.move(25);
	rob.turn(90);
	rob.move(height);
	rob.turn(-90);
	rob.move(20);
	rob.turn(-90);
}
	
	
	
	
}

