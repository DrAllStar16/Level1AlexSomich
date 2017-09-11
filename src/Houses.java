import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Houses {
	static Random r = new Random();

	public static void main(String[] args) {
		Tortoise.setX(25);
		Tortoise.setY(400);
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.setPenWidth(5);
		
		for (int i = 0; i < 12; i++) {
		int b=	r.nextInt(2);
			if (b==0) {
			housey();
			}
			else {
				houseyp();
			}
		
		}
		
	}

	private static void housey() {
		int h=r.nextInt(300)+40;
		Tortoise.setPenColor(PenColors.getRandomColor());
		Tortoise.move(h);
		Tortoise.turn(90);
		Tortoise.move(25);
		Tortoise.turn(90);
		Tortoise.move(h);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Color.green);
		Tortoise.move(15);
		Tortoise.turn(-90);
	}
	private static void houseyp() {
		int h=r.nextInt(300)+40;
		Tortoise.setPenColor(PenColors.getRandomColor());
		Tortoise.move(h);
		Tortoise.turn(45);
		Tortoise.move(25);
		Tortoise.turn(90);
		Tortoise.move(25);
		Tortoise.turn(45);
		Tortoise.move(h);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Color.green);
		Tortoise.move(15);
		Tortoise.turn(-90);
	}
}
