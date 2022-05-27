package com.degreed.assignement;

import java.util.Scanner;

public class IntrestPrblm {

	public static void main(String[] args) {
		 double amount, rateOfIntrest, time, simpleinterest, compoundinterest;
	      
	      Scanner scanner = new Scanner (System. in);
	      
	      System.out.println("Enter the value of Principal ");
	      amount = scanner.nextDouble();
	      
	      System. out. println("Enter the Annual Rate of Interest :");
	      rateOfIntrest = scanner.nextDouble();
	      
	      System. out. println("Enter the Time years:");
	      time = scanner.nextDouble();
	      
	      simpleinterest = (amount * rateOfIntrest * time)/100;
	      compoundinterest = amount * Math.pow(1.0+rateOfIntrest/100.0,time) - amount;
	      
	      System.out.println("Simple Interest: "+simpleinterest);
	      System.out. println("Compound Interest: "+compoundinterest);

	}

}
