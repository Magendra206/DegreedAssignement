package com.collection.degreedassignement;

import java.util.HashSet;

public class UniqueProducts {

	public static void main(String[] args) {
		System.out.println("We can store unique elements or objects in TreeSet or HashSet");
		
		HashSet hs = new HashSet<>();
		hs.add(10);
//		hs.add(10); if we can allow this 10 will not be printed on the console
		hs.add(20);
		hs.add(30);
		hs.add(40);
		System.out.println(hs);

	}

}
