package com.string.degreedassignement;

import java.util.Scanner;

public class LengthOfThePrograme {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to calculate the length");
		String str = scan.nextLine();
		
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			count++;
		}
		System.out.println("length of the String is "+count);
	}

}
