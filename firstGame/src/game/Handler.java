package game;

import java.awt.Graphics;
import java.util.LinkedList;

/*
 * Loops through objects in the game and updates them based on
 * their tick() and render() methods.
 */
public class Handler {
	LinkedList<GameObject> objectList = new LinkedList<>();
	
	public void tick() {
		for (int i = 0; i < objectList.size(); i++) {
			GameObject temp = objectList.get(i);
			temp.tick(); // "tick" is defined by object
			// eg "tick" for player is to move player object
		}
	}
	
	public void render(Graphics g) {
		for (int i = 0; i < objectList.size(); i++) {
			GameObject temp = objectList.get(i);
			temp.render(g); // draws object, based on object's render()
		}
	}
	
	public void addObject(GameObject object) {
		this.objectList.add(object);
	}
	
	public void removeObject(GameObject object) {
		this.objectList.remove(object);
	}
}
