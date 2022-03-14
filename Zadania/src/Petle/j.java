package Petle;

import java.util.Scanner;

public class j 

{

	public static void main(String[] args) 
	
	{
		//Program wyœwietlaj¹cy po³owê choinki o wysokoœci podanej przez u¿ytkownika
		int a,i,j;
		Scanner sc=new Scanner (System.in);
		System.out.println("Podaj liczbê rzêdów: ");
		a=sc.nextInt();
		for (i = 1; i <= a; i++) 
		{
			for (j = 0; j < i; j++) 
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
