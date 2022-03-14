package podstawy2;

import java.util.Scanner;

public class PoleTrojkata2

{

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Oblicz pole trójk¹ta");
		System.out.println("Podaj a");
		double a=sc.nextDouble();
		System.out.println("Podaj b");
		double b=sc.nextDouble();
		System.out.println("Podaj c");
		double c=sc.nextDouble();
		if (a>=b+c||b>=a+c||c>=b+a) {System.out.println("taki trójk¹t nie mo¿e istnieæ");}
		else 
		{
		double p=(a+b+c)/2;
		double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Obliczone pole wynosi");
		System.out.println(s);
		}
	}

}
