package com.collection.degreedassignement;

import java.util.Comparator;

public class MyName implements Comparator<Employee>{

	@Override
	public int compare(Employee n1, Employee n2) {
		// TODO Auto-generated method stub
		return n1.getName().compareTo(n2.getName());
	}

}

 class MyDepartment implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getDepartment().compareTo(o2.getDepartment());
	}
	
}
 
 class MySalary implements Comparator<Employee>
 {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSalary()-o2.getSalary();
		
	}
	 
 }