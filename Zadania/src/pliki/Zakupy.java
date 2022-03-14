package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zakupy 

{

	public static void main(String[] args) throws FileNotFoundException 
	
	{
		int suma = 0;
		int liczba;
		File plik = new File ("zakupy.txt");
		Scanner sc = new Scanner (plik);	
		while (sc.hasNext()) {
			liczba = sc.nextInt();
			suma = suma + liczba;
		}
		System.out.println(suma);
	}
}

