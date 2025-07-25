package jdemo1;

import java.util.Scanner;

public class j41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit.");
		long limit = sc.nextLong();
		long total = 1;
		for(long i=1;i<=limit;i++) {
			if (i==limit) {
				System.out.print(i+" = ");
			}
			else {
				System.out.print(i+" * ");
			}
			total = total * i;
		}
		System.out.print(total);
	}

}