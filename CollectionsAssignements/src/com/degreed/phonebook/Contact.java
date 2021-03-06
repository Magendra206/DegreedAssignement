package com.degreed.phonebook;

import java.util.Scanner;

public class Contact {
	Scanner scan = new Scanner(System.in);
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String emailId;
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	public Contact(Scanner scan, String firstName, String lastName, long phoneNumber, String emailId) {
		super();
		this.scan = scan;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Contact [ firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", emailId=" + emailId + "]";
	}
	
	public void readContactDetails()
	{
		System.out.println("First Name");
		firstName = scan.nextLine();
		System.out.println("Last Name");
		lastName = scan.nextLine();
		System.out.println("PhoneNumber");
		phoneNumber = scan.nextLong();
		System.out.println("EmailId");
		emailId = scan.nextLine();
	}
	
	public void displayContactDetails()
	{
		System.out.println("FirstName :"+firstName);
		System.out.println("LastName :"+lastName);
		System.out.println("Phone Number :"+phoneNumber);
		System.out.println("Email Id :"+emailId);
	}
	
	

}
