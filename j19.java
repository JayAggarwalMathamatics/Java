package jdemo1;

import java.util.Scanner;

public class j19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a dollar amount(should be amount of money you can spend).");
		double money = sc.nextDouble();
		if(money<500.00) {
			System.out.println("You will eat Maggi today.");
		}
		else {
			System.out.println("You will eat pizza today.");
		}
	}

}
