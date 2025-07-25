package jdemo1;

import java.util.Scanner;

public class j28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1.");
		int num1=sc.nextInt();
		System.out.println("Enter number 2.");
		int num2=sc.nextInt();
		int ans = num1>num2?num1:num2;
		System.out.print("The greater number is ");
		System.out.print(ans);
		System.out.print(".");
	}

}
