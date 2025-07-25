package jdemo1;

import java.util.Scanner;

public class j37 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit.");
		long limit = sc.nextLong();
		long sum = 0;
		long count = 0;
		for(long i=1;i<=limit;i++) {
			if (i%7==0) {
				System.out.println(i);
				sum = sum + i;
				count++;
			}
		}
		System.out.println("The sum is "+sum+".");
		System.out.println("The count is "+count+".");
	}
}
