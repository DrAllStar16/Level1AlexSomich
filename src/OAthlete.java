
public class OAthlete {
	private String name;
	
	String getName(){
		return name;
	}
	private String country;
	
	String getcountry(){
		return country;
	}
	private String sport;
	
	String getsport(){
		return sport;
	}
	private int age;
	
	int getage(){
		return age;
	}
	private int Gold;
	
	int getGold(){
		return Gold;
	}
	private int Silver;
	
	int getSilver(){
		return Silver;
	}
	private int Bronze;

	int getBronze(){
		return Bronze;
	}
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
