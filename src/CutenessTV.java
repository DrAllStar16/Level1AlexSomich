import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	public static void main(String[] args) {
	new CutenessTV();
	}
	public CutenessTV(){
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		f.add(p);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		f.setVisible(true);
		b1.setText("DA DUCK");
		b2.setText("A FROG");
		b3.setText("IT'S SO FLUFFY(UNICORN)");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		f.pack();
	}
	
	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}
	
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 JButton b =(JButton)e.getSource(); {
			 if (b.getText().equals("DA DUCK")) {
				showDucks();
			}
			 
			 else if (b.getText().equals("A FROG")) {
					showFrog();
				}
			 else {
				showFluffyUnicorns();
			}
			
		}
	}

}
