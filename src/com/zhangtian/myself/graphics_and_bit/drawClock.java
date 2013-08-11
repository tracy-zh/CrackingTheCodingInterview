package com.zhangtian.myself.graphics_and_bit;
import java.awt.*;
import java.awt.image.BufferedImage;

public class drawClock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		drawClock d = new drawClock();
		d.drawEighthOfCircle(100);
	}
	
	void drawEighthOfCircle(int r) {
		int x = 0, y = (int)Math.sqrt(r * r - x * x) ;
		while(x < y) {
			y = (int) Math.sqrt(r * r - x * x);
			setPixel(x, y);
			x++;
		}
	}

	private void setPixel(int x, int y) {
		// TODO Auto-generated method stub
		BufferedImage i = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
		Graphics g = i.getGraphics();
		g.fillOval(x, y, 1, 1);
	}

}
