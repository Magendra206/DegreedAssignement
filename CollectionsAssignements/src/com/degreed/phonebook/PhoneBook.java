package com.degreed.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
	List<Contact> phoneBook = new ArrayList();
	Scanner scan = new Scanner(System.in);
	public List<Contact> getPhoneBook() {
		return phoneBook;
	}
	public void setPhoneBook(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}
	
	public void addContact(Contact contactObj)
	{
		contactObj.readContactDetails();
		phoneBook.add(contactObj);
	}
	
	public List<Contact> viewAllContact()
	{
		return phoneBook;
		
	}
	
	public List<Contact> viewContactGivenPhone(long phoneNumber)
	{
		List<Contact> contact = new ArrayList();
		for(Contact obj:phoneBook)
		{
			if(obj.getPhoneNumber()==phoneNumber)
			{
				contact.add(obj);
			}
		}
		return contact;
	}
	
	public boolean removeContact(long phoneNumber)
	{
		boolean res = false;
		for(Contact obj:phoneBook)
		{
			if(obj.getPhoneNumber()==phoneNumber)
			{
				res=true;
				phoneBook.remove(obj);
				break;
				
			}
		}
		return res;
	}
	public long phoneNumber() {
		System.out.println("enter the phone number");
		long phoneNumber = scan.nextLong();
		return phoneNumber;
	}

}
