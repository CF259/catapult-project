package catapult;

import java.awt.Polygon;

public class Surroundings extends Polygon{
	private int gravity; //Acceleration due to gravity
	private int airDensity;
	
	public Surroundings(int grav, int air, int[] x, int[] y){
		super(x, y, x.length);
		gravity = grav;
		airDensity = air;
		if(x.length != y.length){
		
		}
<<<<<<< HEAD
	}// This is a change, I guess.
=======
	}
>>>>>>> b78d97856f654fa9720710a55f59f2a1cfb9fa3c
	
	public int getGravity(){
		return gravity;
	}
	
	public int getDensity(){
		return airDensity;
	}
}
