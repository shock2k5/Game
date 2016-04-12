package com.statixvgc.game.level.tile;

import com.statixvgc.game.graphics.Screen;
import com.statixvgc.game.graphics.Sprite;

public class FlowerTile extends Tile{

	public FlowerTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen){
		screen.renderTile(x << 4, y << 4, this);
	}
	
	public boolean solid(){
		return false;
	}
}
