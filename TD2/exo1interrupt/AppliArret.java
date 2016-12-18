package exo1interrupt;

public class AppliArret {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CompteurV2 compte= new CompteurV2();
		compte.lancer(); // lancement du compteur en paralelle
		new Arreteur(compte).lancer();
	}
}
