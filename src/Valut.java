import java.util.Random;

public class Valut {
	int z;
Random r = new Random();
	Valut(){
   z = r.nextInt(1000000);
	
	
}
	public boolean checkcode(int j) {
		if (j==z) {
			System.out.println("BINGO");
			return true;
			
		}
		else {
			System.out.println("Wrong Number");
			return false;
		}
		
	}
}
