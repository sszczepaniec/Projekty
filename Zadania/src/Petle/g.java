package Petle;

import java.util.Scanner;

public class g 

{

	public static void main(String[] args) 
	
	{
		//Program wyœwietlaj¹cy kolejne liczby (do 1000) podzielne przez liczbê podan¹ przez u¿ytkownika
		int a,i;
		Scanner sc=new Scanner (System.in);
		System.out.println("Podaj liczbê ca³kowit¹: ");
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
