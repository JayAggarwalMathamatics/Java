package jdemo1;

import java.util.Scanner;

public class j21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your temperature.");
		double temp = sc.nextDouble();
		if (temp>75) {
			System.out.println("It is a hot day.");
		}
		else {
			System.out.println("It is a cool day.");
		}
	}

}
