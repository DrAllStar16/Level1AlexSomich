import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons2 implements ActionListener {
	
	public static void main(String[] args) {
		new DuelingButtons2().createUI();
	}

	JButton left = new JButton();
	JButton right = new JButton();
	
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(200,200);
	
	JFrame f = new JFrame();
	JPanel p = new JPanel();

	private void createUI() {
		// 1. Add the panel to the frame
f.add(p);
		// 2. Make the frame visible
f.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
left.setText("Click Me");
		// 4. Set the text of the rightButton to "Click me!"
right.setText("Click Me");
		// 5. Add an action listener to the leftButton
left.addActionListener(this);
		// 6. Add an action listener to the rightButton
right.addActionListener(this);
		// 7. Add the leftButton to the panel
p.add(left);
		// 8. Add the rightButton to the panel
p.add(right);
		// 9. Pack the frame
f.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
f.setTitle("Demanding Buttons");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		
		/* If the buttonPressed was the leftButton....*/
			// Set the text of the rightButton to "No, click Me!"
			// Set the PREFERRED size of the rightButton to BIG
			// Set the text of the leftButton to "Click Me!"
			// Set the PREFERRED size of the leftButton to SMALL
		if (buttonPressed==left) {
			left.setText("Click Me");
			left.setPreferredSize(SMALL);
			right.setText("No Click Me");
			right.setPreferredSize(BIG);
		}
		
		/* If the buttonPressed was the rightButton, do the opposite. */
		else {
			right.setText("Click Me");
			right.setPreferredSize(SMALL);
			left.setText("No Click Me");
			left.setPreferredSize(BIG);
		}

		f.pack();
	}
}

