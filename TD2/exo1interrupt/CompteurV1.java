package exo1interrupt;

public final class CompteurV1 implements Runnable {
	public CompteurV1() {
		this.thread = new Thread(this);
	}

	private Thread thread;
	
	public void run() {
		int cpt = 0;
		System.out.println("Depart");
		
		while (!this.thread.isInterrupted())
			System.out.println(cpt++);

		System.out.println("Fin : " + cpt);
	}

	public void fin() {
		// ici, Thread.currentThread().interrupt()serait faux, 
		// car le thread courant est le thread du main()
		this.thread.interrupt(); 
	}

	public void lancer() {
		this.thread.start();		
	}


}
