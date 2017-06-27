/*
 * 1. In a Runner class, make a SeaCreature called “Spongebob”. Use the methods below to make him eat, and laugh.
 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
 */
public class SeaRunner {
	public static void main(String[] args) {
		
		
SeaCreature SB = new SeaCreature("SpongeBob");
SB.eat();
System.out.println(SB.getName());
SB.laugh();


SeaCreature PT = new SeaCreature("Patrick");
PT.eat();
System.out.println(PT.getName());
PT.laugh();


SeaCreature SW = new SeaCreature("Squidward");
SW.eat();
System.out.println(SW.getName());
SW.laugh();


}
}