package com.degreed.membermanipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	List<Member> memberList = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	public List<Member> getMemberList() {
		return memberList;
	}
	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}
	
	public void addMember(Member memberObj)
	{
		memberObj.readMemberDetails();
		memberList.add(memberObj);
	}
	
	public List<Member> viewAllMembers()
	{
		return memberList;
		
	}
	
	public List<Member> viewMemberByAddress(String address)
	{
		List<Member> member = new ArrayList();
		for(Member obj:memberList)
		{
			if(obj.getAddress().equalsIgnoreCase(address))
			{
				member.add(obj);
			}
		}
		return member;
		
	}
	
	public String address()
	{
		System.out.println("Enter the address");
		String address = scan.nextLine();
		return address;
	}

}
