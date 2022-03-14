package tablice;

import java.util.Random;
import java.util.Arrays;

public class f 

{

	public static void main(String[] args) 
	
	{
		Random rd = new Random();
		int[] liczby = new int[10];
		for (int i = 0; i < liczby.length; i++) {
			liczby[i] = rd.nextInt(1000);
		}
		System.out.println("Liczby: " + Arrays.toString(liczby));
		Arrays.sort(liczby);
		System.out.println("Posortowane liczby: " + Arrays.toString(liczby));
		int a = liczby[liczby.length - 1];
		System.out.println("Najwiêksza liczba to: " + a);
	}
}
