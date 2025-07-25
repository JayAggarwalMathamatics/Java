package jdemo1;

import java.util.Scanner;

public class j14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age.");
			int age;
			age = sc.nextInt();
			
			if(age>16)
			{
				System.out.println("You can drive.");
			}
			else {
				System.out.println("You can not drive.");
			}
	}

}
