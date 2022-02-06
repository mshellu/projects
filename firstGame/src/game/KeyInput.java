package game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * Handles key inputs.
 */
public class KeyInput extends KeyAdapter {
	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler; // why add handler?
	}
	
	/*
	 * Object response when a certain key is pressed.
	 */
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode(); // get # value of key pressed
		// numerical values of keys are ASCII values
		
		// if you only want one object to respond you can loop through
		// all objects until the desired one,
		// then write the code corresponding to that object
		for (int i = 0; i < handler.objectList.size(); i++) {
			GameObject temp = handler.objectList.get(i);
			
			if (temp.getId() == ID.Player) {
				//key events for Player
				if (key == KeyEvent.VK_W) { temp.setVelY(-5); }
				// object moves up
				// note that origin (0, 0) is at top left
				// could do change Y to Y - 1 but is slow
				// so change velocity instead
				// works better because we're constantly adding to X instead
				// of only adding once the key is pressed
				if (key == KeyEvent.VK_S) { temp.setVelY(5); }
				if (key == KeyEvent.VK_D) { temp.setVelX(5); }
				if (key == KeyEvent.VK_A) { temp.setVelX(-5); } 
			}
			
			if (temp.getId() == ID.Player2) {
				if (key == KeyEvent.VK_UP) { temp.setVelY(-5); }
				if (key == KeyEvent.VK_DOWN) { temp.setVelY(5); }
				if (key == KeyEvent.VK_RIGHT) { temp.setVelX(5); }
				if (key == KeyEvent.VK_LEFT) { temp.setVelX(-5); } 
			}
		}
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		for (int i = 0; i < handler.objectList.size(); i++) {
			GameObject temp = handler.objectList.get(i);
			
			if (temp.getId() == ID.Player) {
				// want objects to stop, so set velocity to 0
				if (key == KeyEvent.VK_W) { temp.setVelY(0); }
				// object moves up
				// note that origin (0, 0) is at top left
				if (key == KeyEvent.VK_S) { temp.setVelY(0); }
				if (key == KeyEvent.VK_D) { temp.setVelX(0); }
				if (key == KeyEvent.VK_A) { temp.setVelX(0); } 
			}
			
			if (temp.getId() == ID.Player2) {
				if (key == KeyEvent.VK_UP) { temp.setVelY(0); }
				if (key == KeyEvent.VK_DOWN) { temp.setVelY(0); }
				if (key == KeyEvent.VK_RIGHT) { temp.setVelX(0); }
				if (key == KeyEvent.VK_LEFT) { temp.setVelX(0); } 
			}
		}
	}
}
