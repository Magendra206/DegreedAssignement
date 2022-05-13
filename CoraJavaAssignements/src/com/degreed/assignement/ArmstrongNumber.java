package com.degreed.assignement;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check it is Armstrong or not");
		int a = scan.nextInt();
		int original = a,sum = 0,rem;
		while(a>0)
		{
			rem = a%10;
			sum = sum + rem*rem*rem;
			a = a/10;
		}
		if(sum == original)
		{
			System.out.println("given number is armstrong");
		}else
		{
			System.out.println("given number is not an armstrong");
		}

	}

}
