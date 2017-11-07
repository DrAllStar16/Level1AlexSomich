import org.w3c.dom.css.Counter;

public class Athlete {
	private String sport;
	private String name;
	private static  int jersynumber=16;
	private int athleteJersey;
	private static int Counter;
	public Athlete(String sport, String name) {
		this.sport = sport;
		this.name = name;
		this.athleteJersey=jersynumber;
		jersynumber ++;
		Counter ++;
	}


	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getathleteJersey() {
		return athleteJersey;
	}
	
	public static int getCounter() {
		return Counter;
	}

	


	
}
