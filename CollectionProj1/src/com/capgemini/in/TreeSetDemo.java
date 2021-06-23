package com.capgemini.in;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		
		ts.add(10);
		ts.add(1);
		ts.add(9);
		ts.add(5);
		
		System.out.println(ts);//[1,5,9,10]
		
		TreeSet names=new TreeSet();
		names.add("Micky");
		names.add("Johny Walker");
		names.add("Spring");		
		names.add("White Bull");
		
		System.out.println(names);//
		
		TreeSet t=new TreeSet();
		t.add('F');
		t.add('A');
		t.add('C');
		
		System.out.println(t);
		
		}

}
