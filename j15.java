package jdemo1;

import java.util.Scanner;

public class j15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number.");
			int num = sc.nextInt();
			if (num>0) {
				System.out.println("It is positive.");
			}
			else if (num==0) {
				System.out.println("It is neither.");
			}
			else {
				System.out.println("It is negative.");
			}
			}
	}
