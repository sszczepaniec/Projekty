package stddraw;

import java.util.Scanner;

public class Zad2G {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Podaj a");
		double a = sc.nextDouble();
		System.out.println("Podaj b");
		double b = sc.nextDouble();
		StdDraw.setXscale(-1.1, 1.1);
		StdDraw.setYscale(-1.1, 1.1);
		StdDraw.line(-1, 0, 1, 0);
		StdDraw.line(0, -1, 0, 1);
		StdDraw.setPenRadius(0.008);
		for (double x = -1; x <= 1; x+=0.001) {
			double y = a*x+b;
			if (y <= 1) {
			StdDraw.point(x, y);
			}
		}
		//StdDraw.line(-1, -1 * a + b, 1, 1 * a + b);
	}
}
