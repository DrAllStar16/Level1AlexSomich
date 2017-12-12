import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLastestTweet implements ActionListener {
	public static void main(String[] args) {
		new GetLastestTweet();
	}

	public GetLastestTweet() {
		JFrame f = new JFrame();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JTextField tf = new JTextField(15);
		JButton b = new JButton();
		JTextPane tp = new JTextPane();
		tp.setPreferredSize(new Dimension(400, 400));
		f.add(p1, BorderLayout.NORTH);
		f.add(p2, BorderLayout.SOUTH);
		p1.add(tf);
		p1.add(b);
		p2.add(tp);
		f.setVisible(true);
		b.setText("SEARCH");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		b.addActionListener(this);

	}
	// 1. Make a UI with a button and a text field for a search term.
	// done

	// 2. When the button is clicked, print “tweet tweet”.

	// 3. Add these 2 jars to your project’s build path;
	// Commons Logging: commons-logging-1.1.3.jar
	// Twitter4J: twitter4j-core-3.0.5
	// You will find them at /Users/League/Google Drive/league-jars/

	// 4. Use this method to get the latest tweet when the user clicks the button:
	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken("2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN", "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("TWEET TWEET");	
	String tw = getTweet(tf.setText())
	}

}
