package jdemo1;

import java.util.Scanner;

public class j18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Put price of chickoo.");
		double chickoo = sc.nextDouble();
		System.out.println("Put price of banana.");
		double banana = sc.nextDouble();
		if (chickoo>banana) {
			System.out.println("The price of the chickoo is higher.");
		}
		else {
			System.out.println("The price of the banana is higher.");
		}
	}

}
