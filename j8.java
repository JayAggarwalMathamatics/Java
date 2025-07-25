package jdemo1;

import java.util.Scanner;

public class j8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d1,d2,d3,d4,d5,sum,avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature of day 1.");
		d1=sc.nextInt();
		System.out.println("Enter the temperature of day 2.");
		d2=sc.nextInt();
		System.out.println("Enter the temperature of day 3.");
		d3=sc.nextInt();
		System.out.println("Enter the temperature of day 4.");
		d4=sc.nextInt();
		System.out.println("Enter the temperature of day 5.");
		d5=sc.nextInt();
		sum=d1+d2+d3+d4+d5;
		avg=sum/5;
		System.out.println("Sum:" + sum);
		System.out.println("Average:" + avg);
	}

}