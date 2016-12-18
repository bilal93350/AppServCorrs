package carafe3;

public class GarconDeCafe implements Runnable {
	
	private Thread thread;
	private String nom;
	private Carafe carafe;
	
	public GarconDeCafe(String nom, Carafe carafe){
		this.nom = nom;
		this.carafe = carafe;
		this.thread = new Thread(this, nom);
		this.thread.start();

	}
	public void run() {
		System.out.println(nom + " démarre son service");
		try{
			while(true){
			  synchronized (carafe) {
			    while (!carafe.estVide())
			      carafe.wait();
			    System.out.println("************************" + nom 
	        		+ " remplit la carafe");
			    carafe.remplir();
			    carafe.notifyAll();
			  }
			}
		}
		catch(InterruptedException e){
		}
    System.out.println(nom + " a terminé son service"); 
	}
	public void finDeService() {
		this.thread.interrupt();
	}
}
