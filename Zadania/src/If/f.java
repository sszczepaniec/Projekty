package If;

import java.util.Scanner;

public class f 

{

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Podaj dwie liczby");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		if (a<0) {
			a=-a;
		}
		if (b<0) {
			b=-b;
		}
		double c=a-b;
		double d=b-a;
		System.out.println("a-b = "+ c);
		System.out.println("b-a = "+ d);

	}

}
