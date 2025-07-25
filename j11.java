package jdemo1;

import java.util.Scanner;

public class j11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rad, pi, cira;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		rad = sc.nextDouble();
		pi = 3.14;
		cira = rad * rad * pi;
		System.out.println("The area of the circle is:" + cira);
	}

}
