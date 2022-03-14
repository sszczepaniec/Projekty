package If;

import java.util.Scanner;

public class c 

{

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Podaj 3 liczby ca³kowite");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a==b && a==c) {System.out.println("Unikalna liczba to: " + a);}
		else if (a==b) {System.out.println("Unikalne liczby to: " +a+" i "+c);}
		else if (a==c) {System.out.println("Unikalne liczby to: " +a+" i "+b);}
		else if (b==c) {System.out.println("Unikalne liczby to: "+a+" i "+b);}
		else {System.out.println("Unikalne liczby to: " + a+", "+b+" i "+c);}

	}

}
