package com.string.degreedassignement;

import java.util.Scanner;

public class JoinTheTwoStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string 1");
		String str1 = scan.nextLine();
		System.out.println("Enter the string 2");
		String str2 = scan.nextLine();
		System.out.println("After string joining");
		String str = str1 + str2;
		System.out.println(str);

	}

}
