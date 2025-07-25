package jdemo1;

import java.util.Scanner;

public class j40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit.");
		long limit = sc.nextLong();
		long sum = 0;
		for(long i=1;i<=limit;i++) {
			if (i==limit) {
				System.out.print(i+" = ");
			}
			else {
				System.out.print(i+" + ");
			}
			sum = sum + i;
		}
		System.out.print(sum);
	}

}