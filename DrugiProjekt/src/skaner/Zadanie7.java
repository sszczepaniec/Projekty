package skaner;

import java.util.Scanner;

public class Zadanie7 

{

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Oblicz objêtoœæ prostopad³oœcianu");
		System.out.println("Podaj d³ugoœæ boku a");
		double a=sc.nextDouble();
		System.out.println("Podaj d³ugoœæ boku b");
		double b=sc.nextDouble();
		System.out.println("Podaj d³ugoœæ boku c");
		double c=sc.nextDouble();
		double v=a*b*c;
		System.out.println("Objêtoœæ wynosi");
		System.out.println(v);

	}

}
