package tablice;

import java.util.Arrays;
import java.util.Scanner;
 
public class m
 
{
 
	public static void main(String[] args) 
 
	{
		Scanner sc = new Scanner (System.in);
		
		int[] arr = new int[10];
		
		System.out.println("Podaj warto��i tablicy: ");
		
		for (int i = 0; i < arr.length; i++) 
		
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Liczby to: " + Arrays.toString(arr));
		
		while (true) 
		
		{
		System.out.println("Czy chcesz zmieni� jaki� element tablicy? (TAK/NIE) ");
		String a = sc.next();
		if (a.toUpperCase().equals("TAK")) {
			System.out.println("Kt�ry element chcesz zmieni�? ");
			int b = sc.nextInt();
			if (b == 1) {
				System.out.println("Podaj now� warto��: ");
				arr[0] = sc.nextInt();
				System.out.println("Obecne liczby to: " + Arrays.toString(arr));
			}
			if (b == 2) {
				System.out.println("Podaj now� warto��: ");
				arr[1] = sc.nextInt();
				System.out.println("Obecne liczby to: " + Arrays.toString(arr));
			}
			if (b == 3) {
				System.out.println("Podaj now� warto��: ");
				arr[2] = sc.nextInt();
				System.out.println("Obecne liczby to: " + Arrays.toString(arr));
			}
			if (b == 4) {
				System.out.println("Podaj now� warto��: ");
				arr[3] = sc.nextInt();
				System.out.println("Obecne liczby to: " + Arrays.toString(arr));
			}
			if (b == 5) {
				System.out.println("Podaj now� warto��: ");
				arr[4] = sc.nextInt();
				System.out.println("Obecne liczby to: " + Arrays.toString(arr));
			}
			if (b == 6) {
				System.out.println("Podaj now� warto��: ");
				arr[5] = sc.nextInt();
				System.out.println("Obecne liczby to: " + Arrays.toString(arr));
			}
			if (b == 7) {
				System.out.println("Podaj now� warto��: ");
				arr[6] = sc.nextInt();
				System.out.println("Obecne liczby to: " + Arrays.toString(arr));
			}
			if (b == 8) {
				System.out.println("Podaj now� warto��: ");
				arr[7] = sc.nextInt();
				System.out.println("Obecne liczby to: " + Arrays.toString(arr));
			}
			if (b == 9) {
				System.out.println("Podaj now� warto��: ");
				arr[8] = sc.nextInt();
				System.out.println("Obecne liczby to: " + Arrays.toString(arr));
			}
			if (b == 10) {
				System.out.println("Podaj now� warto��: ");
				arr[9] = sc.nextInt();
				System.out.println("Obecne liczby to: " + Arrays.toString(arr));
			}
		} 
		else if (a.toUpperCase().equals("NIE")) {
			System.out.println("Ko�cowe liczby to: " + Arrays.toString(arr));
			break;
		}
		else {
			System.out.println("B��d");
			break;
		}
		}
	}
}