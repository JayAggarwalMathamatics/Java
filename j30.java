package jdemo1;

import java.util.Scanner;

public class j30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a month.");
		String month = sc.nextLine();
		System.out.println("Give me a year.");
		int year = sc.nextInt();
		if (month.equals("January")) {
			System.out.print(month);
			System.out.print(" ");
			System.out.print(year);
			System.out.print(" has 31 days");
		}
		else if (month.equals("February")) {
			if(year%4==0) {
				if(year%100==0) {
					if(year%400==0) {
						System.out.print(month);
						System.out.print(" ");
						System.out.print(year);
						System.out.print(" has 29 days");
					}
					else {
						System.out.print(month);
						System.out.print(" ");
						System.out.print(year);
						System.out.print(" has 28 days");
					}
				}
				else {
					System.out.print(month);
					System.out.print(" ");
					System.out.print(year);
					System.out.print(" has 29 days");
				}
			}
			else {
				System.out.print(month);
				System.out.print(" ");
				System.out.print(year);
				System.out.print(" has 28 days");
			}
		}
		else if (month.equals("March")) {
			System.out.print(month);
			System.out.print(" ");
			System.out.print(year);
			System.out.print(" has 31 days");
		}
		else if (month.equals("April")) {
			System.out.print(month);
			System.out.print(" ");
			System.out.print(year);
			System.out.print(" has 30 days");
		}
		else if (month.equals("May")) {
			System.out.print(month);
			System.out.print(" ");
			System.out.print(year);
			System.out.print(" has 31 days");
		}
		else if (month.equals("June")) {
			System.out.print(month);
			System.out.print(" ");
			System.out.print(year);
			System.out.print(" has 30 days");
		}
		else if (month.equals("July")) {
			System.out.print(month);
			System.out.print(" ");
			System.out.print(year);
			System.out.print(" has 31 days");
		}
		else if (month.equals("August")) {
			System.out.print(month);
			System.out.print(" ");
			System.out.print(year);
			System.out.print(" has 31 days");
		}
		else if (month.equals("September")) {
			System.out.print(month);
			System.out.print(" ");
			System.out.print(year);
			System.out.print(" has 30 days");	
		}
		else if (month.equals("October")) {
			System.out.print(month);
			System.out.print(" ");
			System.out.print(year);
			System.out.print(" has 31 days");
		}
		else if (month.equals("November")) {
			System.out.print(month);
			System.out.print(" ");
			System.out.print(year);
			System.out.print(" has 30 days");
		}
		else if (month.equals("December")) {
			System.out.print(month);
			System.out.print(" ");
			System.out.print(year);
			System.out.print(" has 31 days");
		}
		else {
			System.out.println("Invalid month.");
		}
		
	}

}
