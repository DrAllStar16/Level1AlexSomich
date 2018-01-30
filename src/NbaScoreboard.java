import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NbaScoreboard {
	JLabel home = new JLabel();
	JLabel away = new JLabel();
	JLabel hscore = new JLabel();
	JLabel ascore = new JLabel();
	JLabel htimeouts = new JLabel();
	JLabel atimeouts = new JLabel();

	public NbaScoreboard() {

		JFrame f = new JFrame();
		
		JPanel team1 = new JPanel();
		
		JPanel team2 = new JPanel();
		
		JPanel phome = new JPanel();
		
		JPanel paway = new JPanel();
		
		JPanel phscore = new JPanel();
		
		JPanel pascore = new JPanel();
		
		JPanel phtimeouts = new JPanel();
		
		JPanel patimeouts = new JPanel();
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(150, 100);
		f.setLayout(new BorderLayout());
		team1.setLayout(new BorderLayout());
		team2.setLayout(new BorderLayout());
		f.add(team1, BorderLayout.WEST);
		f.add(team2, BorderLayout.EAST);
		team1.add(phome,BorderLayout.NORTH);
		team1.add(phscore,BorderLayout.CENTER);
		team1.add(phtimeouts,BorderLayout.SOUTH);
		team2.add(paway,BorderLayout.NORTH);
		team2.add(pascore,BorderLayout.CENTER);
		team2.add(patimeouts,BorderLayout.SOUTH);
		
		phome.add(home);
		paway.add(away);
		phscore.add(hscore);
		pascore.add(ascore);
		patimeouts.add(htimeouts);
		phtimeouts.add(atimeouts);
		
		hscore.setOpaque(true);
		hscore.setBackground(new Color(0,200,200));
		
		ascore.setOpaque(true);
		ascore.setBackground(new Color(0,200,200));
		
		home.setOpaque(true);
		home.setBackground(new Color(0,200,200));

		away.setOpaque(true);
		away.setBackground(new Color(0,200,200));
		
		htimeouts.setOpaque(true);
		htimeouts.setBackground(new Color(0,200,200));

		atimeouts.setOpaque(true);
		atimeouts.setBackground(new Color(0,200,200));
		
		
		
		
		home.setText("HOME");
		away.setText("AWAY");
		hscore.setText("0");
		ascore.setText("0");
		htimeouts.setText("3");
		atimeouts.setText("3");
		f.setVisible(true);
		//f.pack();

	}
}
