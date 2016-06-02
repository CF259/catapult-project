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
	}
	
	public int getGravity(){
		return gravity;
	}
	
	public int getDensity(){
		return airDensity;
	}
}
