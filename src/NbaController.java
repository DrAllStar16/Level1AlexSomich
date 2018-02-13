import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NbaController implements ActionListener {
	NbaScoreboard r = new NbaScoreboard();

	JButton hplus1 = new JButton();

	JButton hplus2 = new JButton();

	JButton hplus3 = new JButton();

	JButton aplus1 = new JButton();

	JButton aplus2 = new JButton();

	JButton aplus3 = new JButton();

	JButton atominus1 = new JButton();

	JButton htominus1 = new JButton();

	JButton areset = new JButton();

	JButton hrest = new JButton();

	public static void main(String[] args) {

		new NbaController();

	}

	public NbaController() {

		JFrame f = new JFrame();

		JPanel mainhome = new JPanel();

		JPanel mainaway = new JPanel();

		JPanel phome = new JPanel();

		JPanel paway = new JPanel();

		JPanel pascore = new JPanel();

		JPanel phscore = new JPanel();

		JPanel patimeouts = new JPanel();

		JPanel phtimeouts = new JPanel();

		JLabel home = new JLabel();

		JLabel away = new JLabel();

		JLabel hscore = new JLabel();

		JLabel ascore = new JLabel();

		JLabel htimeouts = new JLabel();

		JLabel atimeouts = new JLabel();

		hplus1.addActionListener(this);
		hplus2.addActionListener(this);
		hplus3.addActionListener(this);
		aplus1.addActionListener(this);
		aplus2.addActionListener(this);
		aplus3.addActionListener(this);
		htominus1.addActionListener(this);
		atominus1.addActionListener(this);
		hrest.addActionListener(this);
		areset.addActionListener(this);
		areset.addActionListener(this);
		hrest.addActionListener(this);

		f.setLayout(new BorderLayout());
		mainhome.setLayout(new BorderLayout());
		mainaway.setLayout(new BorderLayout());

		f.add(mainhome, BorderLayout.WEST);
		f.add(mainaway, BorderLayout.EAST);

		mainhome.add(phome, BorderLayout.NORTH);
		mainhome.add(phscore, BorderLayout.CENTER);
		mainhome.add(phtimeouts, BorderLayout.SOUTH);

		phome.add(home);
		home.setText("HOME");

		phscore.add(hscore);
		hscore.setText("SCORE");
		phscore.add(hplus1);
		hplus1.setText("+1");
		phscore.add(hplus2);
		hplus2.setText("+2");
		phscore.add(hplus3);
		hplus3.setText("+3");

		phtimeouts.add(htimeouts);
		htimeouts.setText("TIMEOUTS");
		phtimeouts.add(htominus1);
		htominus1.setText("-1");
		phtimeouts.add(hrest);
		hrest.setText("RESET");

		mainaway.add(paway, BorderLayout.NORTH);
		mainaway.add(pascore, BorderLayout.CENTER);
		mainaway.add(patimeouts, BorderLayout.SOUTH);

		paway.add(away);
		away.setText("AWAY");

		pascore.add(ascore);
		ascore.setText("SCORE");
		pascore.add(aplus1);
		aplus1.setText("+1");
		pascore.add(aplus2);
		aplus2.setText("+2");
		pascore.add(aplus3);
		aplus3.setText("+3");

		patimeouts.add(atimeouts);
		atimeouts.setText("TIMEOUTS");
		patimeouts.add(atominus1);
		atominus1.setText("-1");
		patimeouts.add(areset);
		areset.setText("RESET");

		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == hplus1) {
			r.sethscore(1);
		} else if (e.getSource() == hplus2) {
			r.sethscore(2);
		} else if (e.getSource() == hplus3) {
			r.sethscore(3);
		} else if (e.getSource() == aplus1) {
			r.setascore(1);
		} else if (e.getSource() == aplus2) {
			r.setascore(2);
		} else if (e.getSource() == aplus3) {
			r.setascore(3);
		}
		else if (e.getSource() == htominus1) {
			r.setatimeouts(-1);
		}
		else if (e.getSource() == atominus1) {
			r.sethtimeouts(-1);
		}
		else if (e.getSource() == hrest) {
			r.setatimeouts(3);
		}
		else if (e.getSource() == areset) {
			r.sethtimeouts(3);
		}

	}
}
