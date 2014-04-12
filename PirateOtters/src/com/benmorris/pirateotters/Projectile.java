package com.benmorris.pirateotters;

import android.graphics.Rect;

public class Projectile {

	private int x, y, speedX;
	private boolean visible;

	private Rect r;

	public Projectile(int startX, int startY) {
		x = startX;
		y = startY;
		speedX = 7;
		visible = true;

		r = new Rect(0, 0, 0, 0);
	}

	public void update() {
		x += speedX;
		r.set(x, y, x + 10, y + 5);
		if (x > 800) {
			visible = false;
			r = null;
		}
		if (x < 800) {
			checkCollision();
		}
	}

	private void checkCollision() {

		for (int i = 0; i < GameScreen.heliBoys.size(); i++) {
			Heliboy h = GameScreen.heliBoys.get(i);

			if (Rect.intersects(r, h.r)) {
				visible = false;

				if (h.health > 0) {
					h.health -= 1;
				}
				if (h.health == 0) {
					GameScreen.heliBoys.remove(h);

				}

			}
		}
		for (int i = 0; i < GameScreen.jontas.size(); i++) {
			Jonte j = GameScreen.jontas.get(i);

			if (Rect.intersects(r, j.r)) {
				visible = false;

				if (j.health > 0) {
					j.health -= 1;
				}

				if (j.health == 0) {
					GameScreen.jontas.remove(j);
				}
			}
		}

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSpeedX() {
		return speedX;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

}
