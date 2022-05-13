package com.degreed.membermanipulation;

import java.util.Scanner;

public class Member {
	Scanner scan = new Scanner(System.in);
	private int memberId;
	private String memberName;
	private String address;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(int memberId, String memberName, String address) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.address = address;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", address=" + address + "]";
	}
	
	public void readMemberDetails()
	{
		System.out.println("Enter The Id");
		memberId = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Name");
		memberName = scan.nextLine();
		System.out.println("Enter Address");
		address = scan.nextLine();
	}
	
	public void displayMemberDetails()
	{
		System.out.println("Id :"+memberId);
		System.out.println("Name :"+memberName);
		System.out.println("Address :"+address);
	}
	
	

}
