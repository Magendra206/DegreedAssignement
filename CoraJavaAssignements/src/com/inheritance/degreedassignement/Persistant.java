package com.inheritance.degreedassignement;

public abstract class Persistant {
	public abstract void persist();

}
class FilePersistant extends Persistant
{

	@Override
	public void persist() {
		System.out.println("This is the method of File");
		
	}
	
}

class DatabasePersistant extends Persistant
{

	@Override
	public void persist() {
		System.out.println("this is the method of Database");
		
	}
	
}
