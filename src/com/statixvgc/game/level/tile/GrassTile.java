package com.statixvgc.game.level.tile;

import com.statixvgc.game.graphics.Screen;
import com.statixvgc.game.graphics.Sprite;

public class GrassTile extends Tile{

	public GrassTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen){
		screen.renderTile(x << 4, y << 4, this);
	}
	
	public boolean solid(){
		return false;
	}
}
