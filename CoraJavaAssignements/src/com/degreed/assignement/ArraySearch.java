<<<<<<< HEAD
package com.degreed.assignement;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Enter the element to Search");
		int element = scan.nextInt();
		
		boolean test = false;
		for (int number : arr) {
			if (number == element) {
				test = true;
				break;
			}
		}

		System.out.println( element+" is present in the array");
		

	}

}
=======
package com.degreed.assignement;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Enter the element to Search");
		int element = scan.nextInt();
		
		boolean test = false;
		for (int number : arr) {
			if (number == element) {
				test = true;
				break;
			}
		}

		System.out.println( element+" is present in the array");
		

	}

}
>>>>>>> fa60ceddba8df13ca097f2d45a33206de3337e7f
