package com.statixvgc.game.level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.statixvgc.game.level.tile.Tile;

public class SpawnLevel extends Level {


	public SpawnLevel(String path) {
		super(path);
	}

	protected void loadlevel(String path) {
		try {
			BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			this.width = w;
			this.height = h;
			tiles = new int[w * h];
			image.getRGB(0, 0, w, h, tiles, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Couldn't load level pixels!");
		}
	}

	protected void generateLevel() {
	}

}
