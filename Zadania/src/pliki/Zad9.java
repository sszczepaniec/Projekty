package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Zad9 

{

	public static void main(String[] args) throws FileNotFoundException 
	
	{
		int[] arr = new int[10];
		File plik = new File ("liczby.txt");
		Scanner sc = new Scanner (plik);
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);

	}

}
