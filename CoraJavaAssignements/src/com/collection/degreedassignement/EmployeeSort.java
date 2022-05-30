package com.collection.degreedassignement;

import java.util.Scanner;

public class EmployeeSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.ID");
			System.out.println("2.Name");
			System.out.println("3.Department");
			System.out.println("4.Salary");
			System.out.println("5>Exit");
			System.out.println("Enter the choice you Want to Print");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				EmployeesStore es = new EmployeesStore();
				es.addObject();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				System.exit(choice);
			default:
				System.out.println("Invalid choice");;
			}
		}

	}

}
