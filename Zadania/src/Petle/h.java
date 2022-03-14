package Petle;

import java.util.Scanner;

public class h 

{

	public static void main(String[] args) 
	
	{
		//Program rysuj¹cy kwadrat za pomoc¹ gwiazdek którego bok ma d³ugoœæ wprowadzon¹ z konsoli
		int bok,i,j;
		Scanner sc=new Scanner (System.in);
		System.out.println("Podaj d³ugoœæ boku: ");
		bok = sc.nextInt();
		for(i = 1; i <= bok; i++)
		{
			for(j = 1; j <= bok; j++)
			{
				System.out.print("* "); 
			}
			System.out.print("\n"); 
		}	

	}

}
