package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zakupy3 {

	public static void main(String[] args) throws FileNotFoundException 
	
	{
		File plik = new File ("zakupy3.txt");
		Scanner sc = new Scanner (plik);
		int suma = 0;
		while(sc.hasNextLine()) {
			System.out.println(sc.next());
			suma = suma + sc.nextInt()*sc.nextInt();
		}
		System.out.println(suma);
	}
}
