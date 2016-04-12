package com.statixvgc.game.entity.mob;

import com.statixvgc.game.graphics.Screen;
import com.statixvgc.game.graphics.Sprite;
import com.statixvgc.game.input.Keyboard;

public class Player extends Mob {

	private Keyboard input;
	private Sprite sprite;
	private int animate = 0;
	private boolean walking = false;

	public Player(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;
	}

	public Player(Keyboard input) {
		this.sprite = Sprite.playerDownStanding;
		this.input = input;
		this.x = 152;
		this.y = 82;
	}

	public void update() {
		int xa = 0, ya = 0;
		if (input.up) ya--;
		if (input.down) ya++;
		if (input.left) xa--;
		if (input.right) xa++;
		if (animate < 7500)
			animate++;
		else
			animate = 0;
		if (xa != 0 || ya != 0) {
			move(xa, ya);
			walking = true;
		} else {
			walking = false;
		}
	}

	public void render(Screen screen) {
		if (dir == 0) {
			sprite = Sprite.playerUpStanding;
			if (walking) {
				if (animate % 20 > 10)
					sprite = Sprite.playerUpWalking1;
				else
					sprite = Sprite.playerUpWalking2;
			}
		}
		if (dir == 1) {
			sprite = Sprite.playerRightStanding;
			if (walking) {
				if (animate % 20 > 10)
					sprite = Sprite.playerRightWalking1;
				else
					sprite = Sprite.playerRightWalking2;
			}
		}
		if (dir == 2) {
			sprite = Sprite.playerDownStanding;
			if (walking) {
				if (animate % 20 > 10)
					sprite = Sprite.playerDownWalking1;
				else
					sprite = Sprite.playerDownWalking2;
			}
		}
		if (dir == 3) {
			sprite = Sprite.playerLeftStanding;
			if (walking) {
				if (animate % 20 > 10)
					sprite = Sprite.playerLeftWalking1;
				else
					sprite = Sprite.playerLeftWalking2;
			}
		}
		screen.renderPlayer(x - 16, y - 16, sprite);
	}
}
