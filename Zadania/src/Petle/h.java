package Petle;

import java.util.Scanner;

public class h 

{

	public static void main(String[] args) 
	
	{
		//Program rysuj�cy kwadrat za pomoc� gwiazdek kt�rego bok ma d�ugo�� wprowadzon� z konsoli
		int bok,i,j;
		Scanner sc=new Scanner (System.in);
		System.out.println("Podaj d�ugo�� boku: ");
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
