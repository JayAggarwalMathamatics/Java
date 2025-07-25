package jdemo1;

import java.util.Scanner;

public class j36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit.");
		long limit = sc.nextLong();
		for(long i=1;i<=limit;i++) {
			if (i%2==0) {
				System.out.println(i);
			}
			else {
				System.out.print("");
			}
		}
	}

}
