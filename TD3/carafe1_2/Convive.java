package carafe1_2;

public class Convive implements Runnable {
  private static final int CAPACITE_VERRE = 10;
  private String nom;
  private Carafe carafe;
  private int tempsPourBoireSonVerre;

  public Convive(String nom, Carafe carafe, int tempsPourBoireSonVerre) {
    this.nom = nom;
    this.carafe = carafe;
    this.tempsPourBoireSonVerre = tempsPourBoireSonVerre;
    new Thread(this).start();
  }

  public void run() {
    try {
      while (true) {
        synchronized (carafe) {
          while (carafe.estVide()){
        	System.out.println(nom + " a soif :::::::::::::::::::::::::::::::");
            carafe.wait();
          }
          
          carafe.retirer(Convive.CAPACITE_VERRE);          
          System.out.println(this.nom + " boit son verre");
          
        }
        Thread.sleep(this.tempsPourBoireSonVerre);
      }
    } catch (InterruptedException e) {
      System.out.println(this.nom + " arrête de boire");
    }
  }
}
