package airMap;

import java.io.IOException;

public class GameLoopThread extends Thread {
	private World world;
	private boolean play;

	public GameLoopThread(World world) {
		this.world = world;
		play = false;
	}

	@Override
	public void run() {
		try {
			while (true) {
				if (play) {
					world.update();
					world.repaint();
					sleep(1000);
				}
			}
		}
		catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}

	public void toggle() {
		if (play) {
			play = false;
		}
		else {
			play = true;
		}
	}
}