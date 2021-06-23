package com.capgemini.in;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add(10);
		lhs.add("Raj");
		lhs.add(10);
		lhs.add(null);
		lhs.add('A');
		lhs.add(false);
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		lhs.clear();
		
		System.out.println(lhs);
		System.out.println("Is LinkedHashSet object empty?"+lhs.isEmpty());
	}

}
