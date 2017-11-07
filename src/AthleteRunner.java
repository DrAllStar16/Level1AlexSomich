
public class AthleteRunner {
	public static void main(String[] args) {
		Athlete Alex = new Athlete("Baseball", " Alex ");
		Athlete Ally = new Athlete("Football", " Ally ");
		Athlete Adam = new Athlete("Golf", " Adam ");
		System.out.println(Adam.getSport() + Adam.getName()+Adam.getathleteJersey());
		Alex.setName(Alex.getName()+" Somich ");
		System.out.println(Alex.getSport() + Alex.getName()+Alex.getathleteJersey());
		System.out.println(Ally.getSport() + Ally.getName()+Ally.getathleteJersey());
		System.out.println(Athlete.getCounter());
	}

}
