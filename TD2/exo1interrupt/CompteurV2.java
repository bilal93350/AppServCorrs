package exo1interrupt;

public final class CompteurV2 implements Runnable {
	public CompteurV2() {
		this.thread = new Thread(this);
	}

	private Thread thread;
	
	public void run() {
		int cpt = 0;
		System.out.println("Depart");
		
		try {
			while (true)
			{
			System.out.println(cpt++);
			Thread.sleep(1);		
			}
		} catch (InterruptedException e) {}
		
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
