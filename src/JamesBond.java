
public class JamesBond {
	JamesBond() {

	}

	public boolean findCode(Valut v) {
		
		for (int i = 0; i < 1000000; i++) {
			
			if (v.checkcode(i)) {
				System.out.println("Your Number is " + i);

			} else {
			
			}

		}
		return false;
	}

}