package com.degreed.membermanipulation;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Library lib = new Library();
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Add Member");
			System.out.println("2.View All Members");
			System.out.println("3.View Member By Address");
			System.out.println("4.Exit");
			System.out.println("Enter The Choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				lib.addMember(new Member());
				break;
			case 2:
				List<Member> res = lib.viewAllMembers();
				for(Member obj:res)
				{
					obj.displayMemberDetails();
				}
				break;
			case 3:
				List<Member> res1 = lib.viewMemberByAddress(lib.address());
				for(Member obj:res1)
				{
					obj.displayMemberDetails();
				}
				break;
			case 4:
				System.exit(choice);
			default:
				System.out.println("not a proper choice");
				
			}
		}

	}

}
