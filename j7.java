package jdemo1;

import java.util.Scanner;

public class j7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int eng,hindi,ss,sum,avg;
		
		System.out.print("Enter marks of English =>");
		eng=sc.nextInt();
		System.out.print("Enter marks of Hindi =>");
		hindi=sc.nextInt();
		System.out.print("Enter marks of Social Studies =>");
		ss=sc.nextInt();		
		sum = eng+hindi+ss;
		avg = (eng+hindi+ss)/3;
		System.out.print("The Sum is => " + sum);
		System.out.print("The Average is => " + avg);
		
	}

}
