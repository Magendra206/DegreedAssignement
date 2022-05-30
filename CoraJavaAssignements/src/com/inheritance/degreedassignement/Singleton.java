package com.inheritance.degreedassignement;

class SingletonExample
{
	static SingletonExample s = new SingletonExample();
	
	private SingletonExample()
	{
		
	}
	
	public static SingletonExample getSingleton()
	{
		return s;
	}
}
// Implicit super constructor SingletonExample() is not visible for default constructor. 
//Must define an explicit constructor
/*class ChildSingleton extends SingletonExample
{
	
}*/

public class Singleton {

	public static void main(String[] args) {
		
		
		SingletonExample res = SingletonExample.getSingleton();
		SingletonExample res1 = SingletonExample.getSingleton();
		System.out.println("object address of the class is "+res);
		System.out.println("object address of the class is "+res1);
		System.out.println("singleton class cannot be inherited because the constructor of the class is private");
	}

}
