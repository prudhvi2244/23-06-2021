package com.capgemini.in;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
	
		TreeMap tm1=new TreeMap();
		tm1.put(11,"Prudhvi");
		tm1.put(6,"Praveen");
		tm1.put(5,10);
		
		System.out.println(tm1);
		
		
		TreeMap tm2=new TreeMap();
		tm2.put('Z',"Prudhvi");
		tm2.put('A',"Praveen");
		tm2.put('P',10);
		
		System.out.println(tm2);
		

	}

}
