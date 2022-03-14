package If;

import java.util.Scanner;

public class n 

{

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Podaj dwie liczby");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		if (a==b) {
			System.out.println("Liczby s¹ równe");
		}
		else {
			System.out.println("Liczby s¹ ró¿ne");
		};

	}

}
