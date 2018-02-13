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
	int awayscore = 0;
	int homescore = 0;
	int awaytimeouts = 3;
	int hometimeouts = 3;

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
		f.setSize(175, 100);
		f.setLayout(new BorderLayout());
		team1.setLayout(new BorderLayout());
		team2.setLayout(new BorderLayout());
		f.add(team1, BorderLayout.WEST);
		f.add(team2, BorderLayout.EAST);
		team1.add(phome, BorderLayout.NORTH);
		team1.add(phscore, BorderLayout.CENTER);
		team1.add(phtimeouts, BorderLayout.SOUTH);
		team2.add(paway, BorderLayout.NORTH);
		team2.add(pascore, BorderLayout.CENTER);
		team2.add(patimeouts, BorderLayout.SOUTH);

		phome.add(home);
		paway.add(away);
		phscore.add(hscore);
		pascore.add(ascore);
		patimeouts.add(htimeouts);
		phtimeouts.add(atimeouts);

		hscore.setOpaque(true);
		hscore.setBackground(new Color(0, 200, 200));

		ascore.setOpaque(true);
		ascore.setBackground(new Color(0, 200, 200));

		home.setOpaque(true);
		home.setBackground(new Color(0, 200, 200));

		away.setOpaque(true);
		away.setBackground(new Color(0, 200, 200));

		htimeouts.setOpaque(true);
		htimeouts.setBackground(new Color(0, 200, 200));

		atimeouts.setOpaque(true);
		atimeouts.setBackground(new Color(0, 200, 200));

		home.setText("HOME");
		away.setText("AWAY");
		hscore.setText("Score: " + homescore);
		ascore.setText("Score: " + awayscore);
		htimeouts.setText("TimeOut: " + hometimeouts);
		atimeouts.setText("TimeOut: " + awaytimeouts);
		f.setVisible(true);
		// f.pack();

	}
	
	public void sethscore(int Bily) {
		
		homescore+=Bily;
		hscore.setText("Score: " + homescore);
		 
		
	}
public void setascore(int Billy) {
		
		awayscore+=Billy;
		ascore.setText("Score: " + awayscore);
		 
		
	}

public void sethtimeouts(int rob) {
	
	hometimeouts=rob;
	htimeouts.setText("TimeOut: " + hometimeouts);
	 
	
}
public void setatimeouts(int robb) {
	
	awaytimeouts=robb;
	atimeouts.setText("TimeOut: " + awaytimeouts);
	 
	
}

	
	
	
	
	
	
	
	
}