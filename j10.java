package jdemo1;

import java.util.Scanner;

public class j10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Double is float
		double height, base, tria;
		Scanner sc = new Scanner(System.in);
		System.out.println("The height of the triangle is:");
		height = sc.nextDouble();
		System.out.println("The base of the triangle is:");
		base = sc.nextDouble();
		tria = height * base * 0.5;
		System.out.println("The area of the triangle is:" + tria);
	}

}
