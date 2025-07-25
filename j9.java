package jdemo1;

import java.util.Scanner;

public class j9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, add, sub, mul, div;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1.");
		num1 = sc.nextInt();
		System.out.println("Enter number 2.");
		num2 = sc.nextInt();
		add = num1+num2;
		sub = num1-num2;
		mul = num1*num2;
		div = num1/num2;
		System.out.println("Addition:" + add);
		System.out.println("Subtraction:" + sub);
		System.out.println("Multiplication:" + mul);
		System.out.println("Division:" + div);
	}

}
