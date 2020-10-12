package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot(90, 400);
	public void run() {

	Random ran = new Random();	
	int q = ran.nextInt(2);
	int hight = ran.nextInt(3);
	drawHouse(100);
	
	if (q == 0) {
	for (int i = 0; i < 9; i++) {		
		int height = ran.nextInt(251);
		drawHouse(height);
	}
		
	if (q == 1) {	
		for (int i = 0; i < 9; i++) {	
		String heght = "small";	
if (hight == 1) {
		heght = "medium";
}
if (hight == 2) {
	heght = "large";
}
drawHouse(heght);	
	}
	}
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
void drawHouse(String heght) {
	int size = 100;
	if (heght.equals("small")) {
		size = 60;
	}
	if (heght.equals("medium")) {
		size = 120;
	}
	if (heght.equals("large")) {
		size = 250;
	}
	rob.setSpeed(30);
	rob.penDown();
	rob.move(size);
	rob.turn(90);
	rob.move(25);
	rob.turn(90);
	rob.move(size);
	rob.turn(-90);
	rob.move(20);
	rob.turn(-90);
}	
	
	
	
}

