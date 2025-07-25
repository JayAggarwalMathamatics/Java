package jdemo1;

import java.util.Scanner;

public class j31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the total amount of classes held.");
		float held = sc.nextFloat();
		System.out.println("Print the total amount of classes attended.");
		int attended = sc.nextInt();
		float percentage=(attended/held)*100;
		System.out.println(percentage);
		if (percentage<75) {
			System.out.println("You can't take the exam.");
		}
		else {
			System.out.println("You can take the exam.");
		}
	}

}
