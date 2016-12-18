package carafe1_1;

public class AppliCarafe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Carafe carafe = new Carafe();
		new GarconDeCafe("Brette", carafe, 80);
		new Convive("Alfred", carafe, 15);
		new Convive("Bebert", carafe, 18);
		new Convive("Chochotte", carafe, 35);
		
	}

}
