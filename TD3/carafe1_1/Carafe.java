package carafe1_1;

public class Carafe {
private static int CONTENANCE_STANDARD = 1000;
	private int quantite;
	private final int contenance;
	public Carafe(int contenance){
		this.quantite = 0;
		this.contenance = contenance;
	}
	public Carafe(){
		this(CONTENANCE_STANDARD);
	}

	public void remplir(){
		synchronized(this){
			this.quantite = this.contenance;
			this.notifyAll();
		}
	}

	public void retirer(int q) throws InterruptedException {
		synchronized(this){
			while (this.estVide()){
				this.wait();
			}
			this.quantite = this.quantite - q;
			if (this.quantite<=0) 
				this.quantite = 0;
		}
	}
	
	public boolean estVide(){
		return (this.quantite <= 0);
	}
}
