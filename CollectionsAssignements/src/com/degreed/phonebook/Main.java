package com.degreed.phonebook;

import java.util.List;
import java.util.Scanner;

import com.degreed.membermanipulation.Member;

public class Main {

	public static void main(String[] args) {
		PhoneBook ph = new PhoneBook();
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Add Contact");
			System.out.println("2.View All Contacts");
			System.out.println("3.View Contact By PhoneNumber");
			System.out.println("4.Remove Contact");
			System.out.println("5.Exit");
			System.out.println("Enter The Choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				ph.addContact(new Contact());
				break;
			case 2:
				List<Contact> res = ph.viewAllContact();
				for(Contact obj:res)
				{
					obj.displayContactDetails();
				}
				break;
			case 3:
				List<Contact> res1 = ph.viewContactGivenPhone(ph.phoneNumber());
				for(Contact obj:res1)
				{
					obj.displayContactDetails();
				}
				break;
			case 4:
				ph.removeContact(ph.phoneNumber());
			case 5:
				System.exit(choice);
			default:
				System.out.println("not a proper choice");
				
			}
		}

	}

}
