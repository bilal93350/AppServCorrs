package carafe2;

public class Carafe {
  private static int CONTENANCE_STANDARD = 100;
  private int quantite;
  private final int contenance;

public Carafe(int contenance) {
    this.quantite = 0;
    this.contenance = contenance;
  }

public Carafe() {
    this(CONTENANCE_STANDARD);
  }

public void remplir() {
    this.quantite = this.contenance;
  }

public void retirer(int q) {
		this.quantite = this.quantite - q;
		if (this.quantite<=0) this.quantite = 0;
		
		//if (this.estVide()) System.out.println("Carafe vide !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

  }

public boolean estVide() {
	return (this.quantite == 0);
}
}
