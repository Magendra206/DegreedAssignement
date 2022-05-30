package com.degreed.assignement;

public class ArmstrongNumberRange {

	public static void main(String[] args) {
<<<<<<< HEAD
		int i=100,arm;
=======
	int i=100,arm;
>>>>>>> fa60ceddba8df13ca097f2d45a33206de3337e7f
		System.out.println("Armstrong numbers between 100-999");
		while(i<1000)
		{
		  arm=armstrongOrNot(i);
		  if(arm==i)
		  System.out.println(i);
		  i++;
		 }
	}
<<<<<<< HEAD

=======
>>>>>>> fa60ceddba8df13ca097f2d45a33206de3337e7f
	 static int armstrongOrNot(int num) {
		 int x,a=0;
			while(num!=0)
			{
				x=num%10;
				a=a+(x*x*x);
				num/=10 ;
			}
			return a;
		
	}

}
