
public class SmurfsRunner {
	public static void main(String[] args) {
		
	
		Smurfs HS = new Smurfs("Handy");
		HS.getName();
		System.out.println(HS.getName());
		HS.eat();
		
	
		Smurfs PA = new Smurfs("Papa");
		PA.getName();
		System.out.println(PA.getName());
		PA.eat();
		PA.getHatColor();
		System.out.println(PA.getHatColor());
		
		
		Smurfs SE = new Smurfs("Smurfette");
		SE.getName();
		System.out.println(SE.getName());
		SE.eat();
		SE.getHatColor();
		System.out.println(SE.getHatColor());
		
	}
}