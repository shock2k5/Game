package com.statixvgc.game.entity;

import java.util.Random;

import com.statixvgc.game.graphics.Screen;
import com.statixvgc.game.level.Level;

public abstract class Entity {

	public int x, y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	public void update(){
	}
	
	public void render(Screen screen){
	}
	
	/**
	 * Remove from level
	 */
	public void remove(){
		removed = true;
	}
	
	public boolean isRemoved(){
		return removed;
	}
}
