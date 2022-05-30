package com.exception.degreedassignement;

import java.util.Scanner;

public class ArithmaticException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int a = scan.nextInt();
		System.out.println("enter a second number");
		int b = scan.nextInt();
		try {
			int sum = a/b;
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println("arithmatic exception");
		}

	}

}
