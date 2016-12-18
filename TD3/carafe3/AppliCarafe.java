package carafe3;

import java.util.Timer;

public class AppliCarafe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Carafe carafe = new Carafe();
		
		GarconDeCafe brette = new GarconDeCafe("brette", carafe);
		Timer timer = new Timer();
		timer.schedule(new FinService(brette, timer), 1000);
		
		new GarconDeCafe("poitrenaud", carafe);
		
		new Convive("Alfred", carafe, 25);
		new Convive("Bebert", carafe, 18);
		new Convive("Chochotte", carafe, 35);
		
		
	}

}
