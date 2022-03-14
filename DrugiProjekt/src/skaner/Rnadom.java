package skaner;

import java.util.Scanner;
import java.util.Random;

public class Rnadom 

{

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner (System.in);
		Random rd=new Random();
		System.out.println("Oblicz pole trÛjkπta");
		System.out.println();
		int r=rd.nextInt(10);
		r+=1;
		double c=r;
		System.out.println("d≥ugoúÊ podstawy wynosi " + c);
		int p=rd.nextInt(10);
		p+=1;
		double d=p;
		System.out.println("wyskoúÊ wynosi " + d);
		System.out.println();
		System.out.println("podaj pole");
		double a=sc.nextDouble();
		double b=(c*d)/2;
		if (a==b) {System.out.println("Dobrze");}
		else if (a!=b) {System.out.println("èle");}

	}

}
