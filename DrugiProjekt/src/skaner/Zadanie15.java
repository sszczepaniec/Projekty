package skaner;

import java.util.Scanner;

public class Zadanie15 

{

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Przeliczanie w�z��w na kilometry na godzin�");
		System.out.println();
		System.out.println("Podaj pr�dko�� w w�z�ach:");
		double a=sc.nextDouble();
		System.out.println("Pr�ko�� w kilometrach na godzin� wynosi");
		double v=a*1.852;
		System.out.println(v);
		
		

	}

}
