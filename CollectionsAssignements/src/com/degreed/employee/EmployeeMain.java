package com.degreed.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList();
		
		emp.add(new Employee("magendra",15000,22,"10-FEB-2022"));
		emp.add(new Employee("ajay",16000,23,"10-FEB-2022"));
		
		Collections.sort(emp);
		System.out.println(emp);
		

	}

}
