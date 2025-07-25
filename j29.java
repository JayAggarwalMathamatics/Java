package jdemo1;

import java.util.Scanner;

public class j29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number 1.");
		int num1=sc.nextInt();
		System.out.println("Please enter number 2.");
		int num2=sc.nextInt();
		if(num1*num2>50) {
			System.out.println(num1+num2);
		}
		else {
			System.out.println(num1*num2);
		}
	}

}
