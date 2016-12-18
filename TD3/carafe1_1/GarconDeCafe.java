package carafe1_1;

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
				carafe.remplir();
				System.out.println("************************" + this.nom + " remplit la carafe");
				Thread.sleep(this.tempsRepos);
			}
		}
		catch(InterruptedException e){
			System.out.println(this.nom + " a terminé son service");	
		}

	}

}
