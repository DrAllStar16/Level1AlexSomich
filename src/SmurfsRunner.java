
public class SmurfsRunner {
	public static void main(String[] args) {
		
	
		Smurfs HS = new Smurfs("Handy");
		HS.eat();
		System.out.println(HS.getName() + "is a " + HS.isGirlOrBoy() + " and has a " + HS.getHatColor() + " hat");
		
	
		Smurfs PA = new Smurfs("Papa");
		PA.eat();
		System.out.println(PA.getName() + "is a " + PA.isGirlOrBoy() + " and has a " + PA.getHatColor() + " hat");
		
		
		Smurfs SE = new Smurfs("Smurfette");  
		SE.eat();
		System.out.println(SE.getName() + "is a " + SE.isGirlOrBoy() + " and has a " + SE.getHatColor() + " hat");
		
		
		Smurfs WE = new Smurfs("Wendy");  
		WE.eat();
		System.out.println(WE.getName() + "is a " + WE.isGirlOrBoy() + " and has a " + WE.getHatColor() + " hat");
	}
}