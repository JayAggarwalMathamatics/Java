package jdemo1;

import java.util.Scanner;

public class j26 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter menu item. 1 for apple, 2 for banana, 3 for orange, 4 for grape, 5 for berry.");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("One apple is $1.00.");
			System.out.println("Please enter the quantity.");
			long quantity = sc.nextInt();
			System.out.println((1.00 * quantity) * 1.075);
			break;
		case 2:
			System.out.println("One banana is $0.25.");
			System.out.println("Please enter the quantity.");
			long quantity2 = sc.nextInt();
			System.out.println((0.25 * quantity2) * 1.075);
			break;
		case 3:
			System.out.println("One orange is $0.75.");
			System.out.println("Please enter the quantity.");
			long quantity3 = sc.nextInt();
			System.out.println((0.75 * quantity3) * 1.075);
			break;
		case 4:
			System.out.println("One apple is $0.05.");
			System.out.println("Please enter the quantity.");
			long quantity4 = sc.nextInt();
			System.out.println((0.05 * quantity4) * 1.075);
			break;
		case 5:
			System.out.println("One berry is $0.05.");
			System.out.println("Please enter the quantity.");
			long quantity5 = sc.nextInt();
			System.out.println((0.05 * quantity5) * 1.075);
			break;
		default:
			System.out.println("Invalid item.");
		}
	}

}
