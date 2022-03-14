package tablice;

import java.util.Arrays;
import java.util.Random;

public class g 

{

	public static void main(String[] args) 
	
	{
		Random rd = new Random();
		int[] liczby = new int[10];
		for (int i = 0; i < liczby.length; i++) {
			int range = rd.nextInt((199 - 140) + 1) + 140;
			liczby[i] = range;
		}
		System.out.println("Liczby to: " + Arrays.toString(liczby));
	}
}
