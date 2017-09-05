
public class NewCatRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
NewCat c1= new NewCat("c1");
		// 1. Make the Cat meow
		c1.meow();
		// 2. Get the Cat to print it's name
c1.printName();
		// 3. Kill the Cat!
for (int i = 0; i <9; i++) {
	c1.kill();
}
c1.kill();
	}
}
