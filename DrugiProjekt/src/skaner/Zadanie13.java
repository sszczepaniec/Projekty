package skaner;

import java.util.Scanner;

public class Zadanie13 

{

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("zamie� m/min na km/h");
		System.out.println();
		System.out.println("podaj pr�dko�� w m/min");
		double a=sc.nextDouble();
		System.out.println("obliczona pr�dko�c w km/h wynosi:");
		double v=a*0.06;
		System.out.println(v);

	}

}
