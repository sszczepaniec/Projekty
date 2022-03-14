package skaner;

import java.util.Scanner;

public class Zadanie15 

{

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Przeliczanie wêz³ów na kilometry na godzinê");
		System.out.println();
		System.out.println("Podaj prêdkoœæ w wêz³ach:");
		double a=sc.nextDouble();
		System.out.println("Prêkoœæ w kilometrach na godzinê wynosi");
		double v=a*1.852;
		System.out.println(v);
		
		

	}

}
