package com.statixvgc.game.graphics;

public class Sprite {

	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;

	public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles);
	public static Sprite flower = new Sprite(16, 1, 0, SpriteSheet.tiles);
	public static Sprite rock = new Sprite(16, 2, 0, SpriteSheet.tiles);
	
	public static Sprite voidSprite = new Sprite(16, 0x4800FF);

	public static Sprite playerLeftStanding = new Sprite(32, 0, 1, SpriteSheet.tiles);
	public static Sprite playerLeftWalking1 = new Sprite(32, 1, 1, SpriteSheet.tiles);
	public static Sprite playerLeftWalking2 = new Sprite(32, 2, 1, SpriteSheet.tiles);
	
	public static Sprite playerRightStanding = new Sprite(32, 3, 1, SpriteSheet.tiles);
	public static Sprite playerRightWalking1 = new Sprite(32, 4, 1, SpriteSheet.tiles);
	public static Sprite playerRightWalking2 = new Sprite(32, 5, 1, SpriteSheet.tiles);
	
	public static Sprite playerUpStanding = new Sprite(32, 0, 2, SpriteSheet.tiles);
	public static Sprite playerUpWalking1 = new Sprite(32, 1, 2, SpriteSheet.tiles);
	public static Sprite playerUpWalking2 = new Sprite(32, 2, 2, SpriteSheet.tiles);
	
	public static Sprite playerDownStanding = new Sprite(32, 3, 2, SpriteSheet.tiles);
	public static Sprite playerDownWalking1 = new Sprite(32, 4, 2, SpriteSheet.tiles);
	public static Sprite playerDownWalking2 = new Sprite(32, 5, 2, SpriteSheet.tiles);
	
	
	
	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * SIZE;
		this.y = y * SIZE;
		this.sheet = sheet;
		load();
	}

	public Sprite(int size, int color) {
		SIZE = size;
		this.pixels = new int[SIZE * SIZE];
		setColor(color);
	}

	private void setColor(int color) {
		for (int i = 0; i < SIZE * SIZE; i++) {
			pixels[i] = color;
		}
	}

	private void load() {
		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				this.pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
			}
		}
	}
}
