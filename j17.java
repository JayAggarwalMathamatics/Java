package jdemo1;

import java.util.Scanner;

public class j17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a year.");
		int year = sc.nextInt();
		if (year%4==0) {
			if(year%100==0){
				if(year%400==0) {
					System.out.println("It is a leap year.");
				}
				else {
					System.out.println("It is not a leap year.");
				}
			}
			else {
				System.out.println("It is a leap year.");
			}
		}
		else {
			System.out.println("It is not a leap year.");
		}
	}

}
