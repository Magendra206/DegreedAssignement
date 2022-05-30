package com.inheritance.degreedassignement;

public abstract class DesertItem {
	public abstract void getCost();

}
class Candy extends DesertItem
{

	@Override
	public void getCost() {
		System.out.println("The cost of an candy is 1 doller");
		
	}
	
}
class Cookie extends DesertItem
{

	@Override
	public void getCost() {
		System.out.println("the cost of an Cookie is 1 Euro");
		
	}
	
}
class IceCream extends DesertItem
{

	@Override
	public void getCost() {
		System.out.println("the cost of an ice cream is 50 rupees");
		
	}
	
}

