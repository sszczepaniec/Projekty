package tablice;

import java.util.Random;
import java.util.Arrays;

public class e 

{

	public static void main(String[] args) 
	
	{
		Random rd = new Random();
		int[] liczby = new int[10];
		for (int i = 0; i < liczby.length; i++) {
			liczby[i] = rd.nextInt(10);
		}
		System.out.println("Liczby to: " + Arrays.toString(liczby));
	}

}
