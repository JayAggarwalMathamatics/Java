package jdemo1;

import java.util.Scanner;

public class j13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num1;
		System.out.println("Enter a number:");
		num1 = sc.nextDouble();
		System.out.println("The Previous Number Is: " + (num1-1));
		System.out.println("The Next Number Is: " + (num1+1));
	}

}
