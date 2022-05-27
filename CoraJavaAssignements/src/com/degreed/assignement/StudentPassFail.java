package com.degreed.assignement;

import java.util.Scanner;

public class StudentPassFail {

	public static void main(String[] args) {
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Enter the mark of three subjects");
		    int m1 = scan.nextInt();
		    int m2 = scan.nextInt();
		    int m3 = scan.nextInt();
		    int avg = m1+m2+m3/3;
		
		     if(avg>=80)
		      {
		        System.out.println("You are in A grade Wow: ");
		      }
		
		     else if(avg>=60 && avg<=80)
		      {
		        System.out.println("You are in B grade veryGood: ");
		      }
		
		     else if(avg>=50 && avg<60)	
		     {
			    	 System.out.println("You are in C grade Good: ");
		
		     }
		     else	
		     {
		
		    	 System.out.println("Fail...Better Luck next Time");
		
		     }

	}

}
