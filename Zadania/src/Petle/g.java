package Petle;

import java.util.Scanner;

public class g 

{

	public static void main(String[] args) 
	
	{
		//Program wy�wietlaj�cy kolejne liczby (do 1000) podzielne przez liczb� podan� przez u�ytkownika
		int a,i;
		Scanner sc=new Scanner (System.in);
		System.out.println("Podaj liczb� ca�kowit�: ");
		a=sc.nextInt();
		for (i = 0; i < 1000; i++) 
		{
			if (i%a==0)
			{
				System.out.println(i);
			}
		}

	}

}
