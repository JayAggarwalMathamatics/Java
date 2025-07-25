package jdemo1;

import java.util.Scanner;

public class j38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit.");
		long limit = sc.nextLong();
		long oddcount = 0;
		long oddsum = 0;
		long evencount = 0;
		long evensum = 0;
		for(long i=1;i<=limit;i++) {
			String parity = i%2==0?" Even":" Odd";
			if (parity == " Even") {
				evencount++;
				 evensum = evensum + i;
			}
			else {
				oddcount++;
				 oddsum = oddsum + i;
			}
			System.out.println(i+parity);
		}
		System.out.println("The odd sum is "+oddsum+".");
		System.out.println("The odd count is "+oddcount+".");
		System.out.println("The even sum is "+evensum+".");
		System.out.println("The even count is "+evencount+".");
	}

}
