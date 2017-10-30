
public class Taco {
private String Shell;
private String Meat;
private	boolean Guac;
private static int counter;
	public Taco(String Shell, String Meat, boolean Guac) {
		this.Shell= Shell;
		this.Meat= Meat;
		this.Guac= Guac;
		counter++;
		
		
	}
	

public String getMeat() {
	return Meat;
}
 void setMeat(String Meat) {
	this.Meat= Meat;
}
public String getShell() {
	return Shell;
}
 void setShell(String Shell) {
	this.Shell= Shell;
}
public boolean getGuac() {
	return Guac;
}
 void setGuac(boolean Guac) {
	this.Guac= Guac;
	
}
 public static int getCounter() {
	return counter;
}
}

