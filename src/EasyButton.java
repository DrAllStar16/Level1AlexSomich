import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EasyButton implements MouseListener{
public static void main(String[] args) {
	EasyButton eb = new EasyButton();
	eb.showEasyButton();
	
}
	/*
	 * Use the methods below to make an easy button show on the screen. 
	 * When clicked, it says some very annoying words.
	 */

	JLabel easyButtonImage;

	private void showEasyButton() {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.addMouseListener(this);
		URL imageURL = null;
		try {
			imageURL = new File("src/eb.jpeg").toURI().toURL();
		} catch (MalformedURLException e) {
			System.err.println("Could not load file: " + imageURL);
		}
		Icon icon = new ImageIcon(imageURL);
		this.easyButtonImage = new JLabel(icon);
		quizWindow.add(easyButtonImage);
		quizWindow.pack();
	}


	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		
		}
		
	


	@Override
	public void mousePressed(MouseEvent e) {
		JOptionPane.showMessageDialog(null, "EASYYYYYYYYYYYYYYYYYYY");
		
	}
	

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

