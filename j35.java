package jdemo1;

import java.util.Scanner;

public class j35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit.");
		long limit = sc.nextLong();
		for(long i=1;i<=limit;i++) {
			String parity = i%2==0?" Even":" Odd";
			System.out.println(i+parity);
		}
	}

}
