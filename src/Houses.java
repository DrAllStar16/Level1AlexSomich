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
		for (int i = 0; i < 11; i++) {
			housey();
		}
		
	}

	private static void housey() {
		int h=r.nextInt(400)+40;
		Tortoise.setPenColor(PenColors.getRandomColor());
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(25);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Color.green);
		Tortoise.move(15);
	}
}
