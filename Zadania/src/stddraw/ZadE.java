package stddraw;

import java.util.Scanner;

public class ZadE {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner (System.in);
		double a, b, x, y;
		System.out.println("Podaj współrzędną x pierwszego punktu: ");
		a = sc.nextDouble();
		System.out.println("Podaj współrzędną y pierwszego punktu: ");
		b = sc.nextDouble();
		System.out.println("Podaj współrzędną x drugiego punktu: ");
		x = sc.nextDouble();
		System.out.println("Podaj współrzędną y drugiego punktu: ");
		y = sc.nextDouble();
		StdDraw.setPenRadius(0.3);
		StdDraw.point(a, b);
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.point(x, y);


	}

}
