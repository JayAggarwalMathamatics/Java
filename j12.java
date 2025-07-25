package jdemo1;

import java.util.Scanner;

public class j12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num, sq, cu;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextDouble();
		sq = num * num;
		cu = sq * num;
		System.out.println("The square is:" + sq);
		System.out.println("The cube is:" + cu);
	}

}
