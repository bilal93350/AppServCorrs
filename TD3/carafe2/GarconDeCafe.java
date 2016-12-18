package carafe2;

public class GarconDeCafe implements Runnable {
	
	private String nom;
	private Carafe carafe;
	
	public GarconDeCafe(String nom, Carafe carafe){
		this.nom = nom;
		this.carafe = carafe;
		new Thread(this).start();

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

}
