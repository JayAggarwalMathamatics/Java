package jdemo1;

import java.util.Scanner;

public class j16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num = sc.nextInt();
		if (num%2==0) {
			System.out.println("It is even.");
		}
		else {
			System.out.println("It is odd.");
		}
	}

}
