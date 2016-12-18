package exo1interrupt;

import java.util.Scanner;

public class Arreteur implements Runnable {

	public Arreteur(CompteurV2 compteur) {
		this.compteur = compteur;

	}
	
	private CompteurV2 compteur;
	
	public void run() {
		Scanner clavier = new Scanner(System.in);
		clavier.next(); // attente de la saisie clavier
		this.compteur.fin();
		clavier.close();
	}
	
	public void lancer() {
		new Thread(this).start();
	}

}
