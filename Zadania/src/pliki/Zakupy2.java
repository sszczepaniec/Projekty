package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zakupy2 

{

public static void main(String[] args) throws FileNotFoundException 
	
	{
		double suma = 0;
		double liczba;
		File plik = new File ("zakupy2.txt");
		Scanner sc = new Scanner (plik);	
		while (sc.hasNextDouble()) {
			liczba = sc.nextDouble();
			suma = suma + liczba;
		}
		System.out.println(suma);
	}
}
