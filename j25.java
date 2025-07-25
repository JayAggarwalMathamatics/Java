package jdemo1;

import java.util.Scanner;

public class j25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for square, and 2 for cube. =>");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("Enter a number. =>");
			double b = sc.nextDouble();
			System.out.println(b*b);
			break;
		case 2:
			System.out.println("Enter a number. =>");
			double c = sc.nextDouble();
			System.out.println(c*c*c);
			break;
		default:
			System.out.println("Invalid operation.");
		}
	}

}
