package jdemo1;

import java.util.Scanner;

public class j27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num1 = sc.nextInt();
		
		String ans=num1>0? "No is + ": num1==0? "No is neither": "No is -";
		
		System.out.println(ans);
		
		
	}

}
