import java.awt.Color;
import java.rmi.registry.LocateRegistry;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) {
	World earth = new World();

	Bug randy = new Bug();
	Location l = new Location(9,9);
	Bug bily = new Bug();
	Random r= new Random();
	int x = r.nextInt(10);
	int y = r.nextInt(10);
	Location l2 = new Location(y,x);
	earth.add(l, randy);
	earth.add(l2, bily);
	bily.turn();
	bily.turn();
	//Location l3= new Location(y,x-1);
	Location l4= new Location(y,x+1);
Flower f = new Flower();
Flower f2 = new Flower();
earth.add(new Location(y,x-1), f);
earth.add(l4, f2);
for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 10; j++) {
		Location l5 = new Location(i,j);
		Flower f5 = new Flower();
		earth.add(l5, f5);
	}
}
	bily.setColor(Color.CYAN);
	earth.show();
}
}
