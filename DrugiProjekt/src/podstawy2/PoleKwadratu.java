package podstawy2;

import java.util.Scanner;

public class PoleKwadratu 

{

	public static void main(String[] args) 
	
	{
		System.out.println("Podaj d³ugoœæ boku kwadratu");
		Scanner sc=new Scanner (System.in);
		double x=sc.nextDouble();
		System.out.println("Obliczone pole wynosi");
		System.out.println(x*x);

	}

}
