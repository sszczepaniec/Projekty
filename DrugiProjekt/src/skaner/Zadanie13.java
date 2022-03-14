package skaner;

import java.util.Scanner;

public class Zadanie13 

{

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("zamieñ m/min na km/h");
		System.out.println();
		System.out.println("podaj prêdkoœæ w m/min");
		double a=sc.nextDouble();
		System.out.println("obliczona prêdkoœc w km/h wynosi:");
		double v=a*0.06;
		System.out.println(v);

	}

}
