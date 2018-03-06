
public class OAthlete {
	private String name;
	private String country;
	private String sport;
	private int age;
	private int Gold;
	private int Silver;
	private int Bronze;

	void setGold(int num) {
		this.Gold = num;
	}

	void setSilver(int num) {
		this.Silver = num;
	}

	void setBronze(int num) {
		this.Bronze = num;
	}

	public OAthlete(String Name, String Sport, String Country, int Age) {
		this.name = Name;
		this.country = Country;
		this.sport = Sport;
		this.age = Age;

	}
}
