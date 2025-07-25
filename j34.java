package jdemo1;

import java.util.Scanner;

public class j34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		long num1 = sc.nextLong();
		for(int i=1;i<=12;i++) {
			long entry = num1 * i;
			System.out.println(num1+" * "+i+" = "+entry);
		}
	}

}
