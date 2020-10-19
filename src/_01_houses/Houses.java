package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot(90, 400);

	public void run() {

		Random ran = new Random();
		int q = ran.nextInt(2);
		if (q == 0) {
			for (int i = 0; i < 10; i++) {
				int col = ran.nextInt(151);
				int red = col;
				int blue = col;
				int green = col;
				Color colour = new Color(red, blue, green);
				int height = ran.nextInt(251);
				drawHouse(height, colour);
			}
		}
			if (q == 1) {
				for (int i = 0; i < 10; i++) {
					int col = ran.nextInt(150);
					int red = col;
					int blue = col;
					int green = col;
					Color colour = new Color(red, blue, green);
					int hight = ran.nextInt(3);
					String heght = "small";
					if (hight == 1) {
						heght = "medium";
					}
					if (hight == 2) {
						heght = "large";
					}
					drawHouse(heght, colour);
				}
			
		}

	}

	void drawHouse(int height, Color colour) {
		rob.setPenColor(colour);
		rob.setSpeed(30);
		rob.penDown();
		int tip = 90;
		int monkey = 0;
		int bob = 0;
		if (height < 125) {
		tip = 45;	
		monkey = 25;
		bob = 45;
		}
		rob.move(height);
		rob.turn(tip);
		rob.move(25);
		rob.turn(90);
		rob.move(monkey);
		rob.turn(bob);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(0, 150, 0);
		rob.move(20);
		rob.turn(-90);
	}

	void drawHouse(String heght, Color colour) {
		int size = 100;
		rob.setPenColor(colour);
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
		int tip = 90;
		int monkey = 0;
		int bob = 0;
		if (size < 125) {
		tip = 45;	
		monkey = 25;
		bob = 45;
		}
		rob.move(size);
		rob.turn(tip);
		rob.move(25);
		rob.turn(90);
		rob.move(monkey);
		rob.turn(bob);
		rob.move(size);
		rob.turn(-90);
		rob.setPenColor(0, 150, 0);
		rob.move(20);
		rob.turn(-90);
	}

}
