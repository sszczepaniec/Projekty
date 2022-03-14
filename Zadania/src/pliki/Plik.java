package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Plik 

{

	public static void main(String[] args) throws FileNotFoundException 
	
	{
		File imie = new File("imie.txt");
		Scanner sc = new Scanner (imie);
		for (int i = 0; i < 15; i++) {
			System.out.println(sc.nextLine());
		}
		
	}
}
