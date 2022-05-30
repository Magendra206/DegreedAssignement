package com.inheritance.degreedassignement;

abstract class AbstractMethods
{
	public abstract void getMethods();
	public void printMessage() {
		System.out.println("This is non abstarct Method");
	}
}

// abstract class cannot be private
//private abstract class Hello
//{
//	it will show error like remove private identifier
//}

// abstract class cannot be final
//final abstract class Hello
//{
//	
//}
/*
 * a class can be abstract or final but cant be both at a time
 */
abstract class Hello
{
	public void simpleMethod()
	{
		System.out.println("we can declare a class as abstract without having any abstract methods");
	}
}




public class AbstractClassMethod extends AbstractMethods{

	public static void main(String[] args) {
		
//		AbstractMethods am = new AbstractMethods();
// here we cannot create objects for abstract classess
		
		AbstractClassMethod a = new AbstractClassMethod();
		a.getMethods();
		a.printMessage();
	}

	@Override
	public void getMethods() {
		System.out.println("This is a abstarct method");
		
	}

}
