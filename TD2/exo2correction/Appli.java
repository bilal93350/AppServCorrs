package exo2correction;

public class Appli {
	public static void main(String args[]) {
	    System.out.println("VALEUR " + Incrementeur.getValeur());
	    
	    Thread inc1 = new Thread(new Incrementeur("Thread1"));
	    Thread inc2 =new Thread(new Incrementeur("Thread2"));
	    
	    inc1.start();
	    inc2.start();
	    
	    try {
			inc1.join();
			inc2.join();
		} catch (InterruptedException e) {}
	    
	    System.out.println("VALEUR " + Incrementeur.getValeur());
	  }
}
