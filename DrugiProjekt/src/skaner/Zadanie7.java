package skaner;

import java.util.Scanner;

public class Zadanie7 

{

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Oblicz obj�to�� prostopad�o�cianu");
		System.out.println("Podaj d�ugo�� boku a");
		double a=sc.nextDouble();
		System.out.println("Podaj d�ugo�� boku b");
		double b=sc.nextDouble();
		System.out.println("Podaj d�ugo�� boku c");
		double c=sc.nextDouble();
		double v=a*b*c;
		System.out.println("Obj�to�� wynosi");
		System.out.println(v);

	}

}
