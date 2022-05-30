package com.inheritance.degreedassignement;

import java.util.Scanner;

public class DesertShop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the role:owener or customer");
		String role = scan.nextLine();
		if(role.equalsIgnoreCase("customer"))
		{
			Customer cust = new Customer();
			cust.orederSomeDeserts();
		}else if(role.equalsIgnoreCase("owener"))
		{
			Owener own = new Owener();
		}else
		{
			System.out.println("Invalid role");
		}
	}

}
