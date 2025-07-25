package jdemo1;

import java.util.Scanner;

public class j20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight.");
		double weight = sc.nextDouble();
		if (weight<175) {
			System.out.println("You are normal weight.");
		}
		else {
			System.out.println("You are overweight.");
		}
	}

}
