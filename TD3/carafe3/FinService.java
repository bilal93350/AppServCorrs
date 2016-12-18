package carafe3;

import java.util.Timer;
import java.util.TimerTask;

public class FinService extends TimerTask {
	private GarconDeCafe garconDecafe;
	private Timer timer;
	
	public FinService(GarconDeCafe garconDecafe, Timer timer) {
		this.garconDecafe = garconDecafe;
		this.timer = timer;
	}

	@Override
	public void run() {
		this.garconDecafe.finDeService();
		this.timer.cancel();
	}

}
