package Petle;

import java.util.Scanner;

public class j 

{

	public static void main(String[] args) 
	
	{
		//Program wy�wietlaj�cy po�ow� choinki o wysoko�ci podanej przez u�ytkownika
		int a,i,j;
		Scanner sc=new Scanner (System.in);
		System.out.println("Podaj liczb� rz�d�w: ");
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
