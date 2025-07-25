package jdemo1;

import java.util.Scanner;

public class j24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number. => ");
		double a = sc.nextDouble();
		System.out.println("Enter a number. => ");
		double b = sc.nextDouble();
		System.out.println("Enter a operation number(1 for +, 2 for -, 3 for *, 4 for /). => ");
		int operation = sc.nextInt();
		switch(operation) {
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				System.out.println(a/b);
				break;
			default:
				System.out.println("No valid answer.");
		}
	}

}
