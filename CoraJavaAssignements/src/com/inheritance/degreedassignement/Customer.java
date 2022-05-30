package com.inheritance.degreedassignement;

import java.util.Scanner;

public class Customer {
	Scanner scan = new Scanner(System.in);
	public void orederSomeDeserts()
	{
		System.out.println("these are the deserts present in the shop");
		System.out.println("1.Candy");
		System.out.println("2.Cookie");
		System.out.println("3.Icecram");
		System.out.println("Enter the desert you want to order");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			Candy c = new Candy();
			c.getCost();
			System.out.println("Candy is Booked Successfully");
			break;
		case 2:
			Cookie ck = new Cookie();
			ck.getCost();
			System.out.println("Cookie is booked Successfully");
			break;
		case 3:
			IceCream i = new IceCream();
			i.getCost();
			System.out.println("Ice cream is booked successfully");
			break;
		default:
			System.out.println("Invalid choice");;
		}
	}

}
