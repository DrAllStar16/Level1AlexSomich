import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
Random r= new Random();
		// 1. Create a fra me & make it visible
		JFrame f = new JFrame();
		f.setVisible(true);
		// 2. Add the panel to the frame
		f.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands
		panel.setBackgroundImage("https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg");
		// 4. Instantiate a Turtle
		Turtle Timmy = new Turtle();
		// 5. Add the turtle to the panel
		for (int i = 0; i < 50; i++) {

			Timmy.setX(r);
			Timmy.setY(r);
			panel.addTurtle(Timmy);
			f.pack();
			// 6. Put 50 Turtles on the beach

		}
	}
}
