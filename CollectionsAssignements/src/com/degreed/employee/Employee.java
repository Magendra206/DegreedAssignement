package com.degreed.employee;

public class Employee implements Comparable<Employee>{
	private String name;
	private int salary;
	private int age;
	private String dateOfJoin;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int salary, int age, String dateOfJoin) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.dateOfJoin = dateOfJoin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + ", dateOfJoin=" + dateOfJoin + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.getName());
	}
	
	

}
