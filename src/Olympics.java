
public class Olympics {

public static void main(String[] args) {
	OAthlete a =new OAthlete("BillyBobJoe","Basketball","Great Britin",21);
	OAthlete b =new OAthlete("Pickle","Golf","Spain",99);
	OAthlete c =new OAthlete("Spongebob","Surfing","Austrailea",13);
	
	a.setSilver(2);
	a.setBronze(1);
	b.setSilver(1);
	b.setBronze(2);
	c.setGold(3);
	
	System.out.println(a.getName()+","+a.getsport()+","+a.getcountry()+",Age"+a.getage()+","+a.getBronze()+" Bronze Medals "+a.getSilver()+" Silver Medals "+a.getGold()+" Gold Medals");
	System.out.println(b.getName()+","+b.getsport()+","+b.getcountry()+",Age"+b.getage()+","+b.getBronze()+" Bronze Medals "+b.getSilver()+" Silver Medals "+b.getGold()+" Gold Medals");
	System.out.println(c.getName()+","+c.getsport()+","+c.getcountry()+",Age"+c.getage()+","+c.getBronze()+" Bronze Medals "+c.getSilver()+" Silver Medals "+c.getGold()+" Gold Medals");

}
}
