package tablice;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class l 

{

	public static void main(String[] args) 
	
	{
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		double liczby[] = new double[10];
		System.out.print("Podaj wartość: ");
		double n = sc.nextDouble();
		double min = -n;
		for (int i = 0; i < liczby.length; i++) {
			double range = min + (n - min) * rd.nextDouble();
			liczby[i] = range;
		}
		Arrays.sort(liczby);
		System.out.println("Liczby: " + Arrays.toString(liczby));
		

	}

}
