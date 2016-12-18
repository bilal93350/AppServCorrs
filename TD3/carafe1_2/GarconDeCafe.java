package carafe1_2;

public class GarconDeCafe implements Runnable {
	
	private String nom;
	private int tempsRepos;
	private Carafe carafe;
	
	public GarconDeCafe(String nom, Carafe carafe, int repos){
		this.nom = nom;
		this.tempsRepos = repos;
		this.carafe = carafe;
		new Thread(this).start();
	}
	
	public void run() {
		System.out.println(this.nom + " démarre son service");
		try{
			while(true){
			  synchronized (carafe) {
				  
		        carafe.remplir();
		        
		        System.out.println("************************" + nom + " remplit la carafe");
		        carafe.notifyAll();
			  }
			Thread.sleep(tempsRepos);
			}
		}
		catch(InterruptedException e){
			System.out.println(nom + " a terminé son service");	
		}
	}
}
