
public class TacoRunner {
	public static void main(String[] args) {
		Taco Timmy= new Taco( "Corn",  "GroundBeef",  true);
		Taco Tommy= new Taco( "Flour",  "Bacon",  true);
		System.out.println(Timmy.getShell()+"  "+Timmy.getMeat()+"  "+Timmy.getGuac());
		System.out.println(Tommy.getShell()+"  "+Tommy.getMeat()+"  "+Tommy.getGuac());
		Timmy.setMeat("ChickenLittle");
		Timmy.setGuac(false);
		System.out.println(Timmy.getShell()+"  "+Timmy.getMeat()+"  "+Timmy.getGuac());
		System.out.println("I ate "+Taco.getCounter()+" Tacos");
	}
}

