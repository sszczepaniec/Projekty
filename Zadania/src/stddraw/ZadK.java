package stddraw;

import java.util.Random;

public class ZadK {

	public static void main(String[] args) 
	{
		Random rd = new Random();
		int r, g, b;
		while(true) {
			r = rd.nextInt(256);
			g = rd.nextInt(256);
			b = rd.nextInt(256);
			StdDraw.setPenColor(r, g, b);
			StdDraw.text(Math.random(), Math.random(), "Carlito");
			StdDraw.pause(1000);
			StdDraw.clear();
			
		}
		
	}

}
