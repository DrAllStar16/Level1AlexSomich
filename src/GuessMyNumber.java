import java.util.Random;

public class GuessMyNumber {
	int run;
	Random r = new Random();
	
public GuessMyNumber() {
	
	run=r.nextInt(100);
	run+=1000;

	
}
 public boolean checknumber(int w) {
	 if (run==w) {
		return true;
	}
	 else {
		return false;
	}
	 
 }
}
