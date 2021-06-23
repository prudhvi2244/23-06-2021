package com.capgemini.in;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
	
		HashSet hs=new HashSet();
		HashSet hs1=new HashSet();
		
		hs1.add(10);
		hs1.add("Raj");
		hs1.add(10);
		hs1.add(null);
		hs1.add('A');
		hs1.add(false);
			
		
		hs.add(10);
		hs.add("Raj");
		hs.add(10);
		hs.add(null);
		hs.add('A');
		hs.add(false);
		
		System.out.println(hs);
		System.out.println("Size of HashSet :"+hs.size());
		System.out.println("HashSet hs contains Raj:"+hs.contains("Raj"));
		System.out.println("hs and hs1 contains same objects?:"+hs.equals(hs1));
		
		
		

	}

}
