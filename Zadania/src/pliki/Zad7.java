package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad7 

{

	public static void main(String[] args) throws FileNotFoundException 
	
	{	
		int a;
		int b = 0;
		File plik = new File ("zad7.txt");
		Scanner sc = new Scanner (plik);
		for (int i = 0; sc.hasNext(); i++) {
			a = sc.nextInt();
			if (a == 4) {
				 b++;
			}
		}
		System.out.println("Ilość czwórek: " + b);
	}

}
