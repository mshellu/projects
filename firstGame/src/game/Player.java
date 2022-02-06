package game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
/*
 * Object of the player in game.
 */
public class Player extends GameObject {
	Random r;
	
	public Player(int x, int y, ID id) {
		super(x, y, id);
	}

	@Override
	public void tick() {
		x += velX; // how object moves
		y += velY;
	}

	@Override
	public void render(Graphics g) {
		if (id == ID.Player) {
			g.setColor(Color.white);
		} else if (id == ID.Player2) {
			g.setColor(Color.blue);
		}
		
		g.fillRect(x,  y, 32, 32);
	}
}
