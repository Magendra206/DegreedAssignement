<<<<<<< HEAD
package com.degreed.assignement;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		double t=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter income ");
		double amount=sc.nextDouble();
		t=incomeTax(amount);
		System.out.println("Income tax amount is "+t);

	}

	 static double incomeTax(double amount) {
		
		double tax=0;	
		if(amount>=0 && amount<=180000) {
			tax=0;
		}
		else if(amount>=181001 && amount<=300000) {
			tax=0.1*(amount-181001);
		}
		else if(amount>=300001 && amount<=500000) {
			tax=(0.2*(amount-300001))+10000;
		}
		else if(amount>=5000001 && amount<=10000000) {
			tax=(0.3*(amount-5000001))+50000;
		}
		else {		
		return tax; 
		}
		return tax;
	}

}
=======
package com.degreed.assignement;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		double t=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter income ");
		double amount=sc.nextDouble();
		t=incomeTax(amount);
		System.out.println("Income tax amount is "+t);

	}

	 static double incomeTax(double amount) {
		
		double tax=0;	
		if(amount>=0 && amount<=180000) {
			tax=0;
		}
		else if(amount>=181001 && amount<=300000) {
			tax=0.1*(amount-181001);
		}
		else if(amount>=300001 && amount<=500000) {
			tax=(0.2*(amount-300001))+10000;
		}
		else if(amount>=5000001 && amount<=10000000) {
			tax=(0.3*(amount-5000001))+50000;
		}
		else {		
		return tax; 
		}
		return tax;
	}

}
>>>>>>> fa60ceddba8df13ca097f2d45a33206de3337e7f
