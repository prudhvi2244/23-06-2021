package com.capgemini.in;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		//To add an element into ArrayList
		al.add(10);
		al.add('A');
		al.add("Prudhvi");
		al.add(true);
		al.add(900.252);
		al.add(10);
		al.add(null);
		
		System.out.println(al);
		//returns number of objects present in ArrayList
		System.out.println("Size of Array List :"+al.size());
		
		//checks wheather arraylist is empty or not,returns true if empty else returns false
		System.out.println("Is ArrayList Empty?:"+al.isEmpty());
		
		//contains() method returns true if given object is available else returns false
		System.out.println("Is Prudhvi object available ?"+al.contains("Prudhvi"));
		
		//converts Collection to object array
		Object obj[]=al.toArray();
		
		System.out.println(obj[0]);
		
		//Removes all objects from Collection
		
		
		ArrayList al2=new ArrayList();
		al2.add(1);
		
		ArrayList al3=new ArrayList();
		al3.add(1);
		al3.add(10);
		
		//checks wheather content of 2 collection objects are same or not,if same returns true else returns false
		System.out.println(al2.equals(al3));
		
		//removes given object from collection
		al.remove("Prudhvi");
		System.out.println(al);
		
		//removes object based on index
		al.remove(0);
		System.out.println(al);
		
		al.set(2,1);
		System.out.println(al);
		
		al.add(0,"B");
		System.out.println(al);
		
		System.out.println("Object available at index position 3:"+al.get(3));
		
		al.clear();
		System.out.println(al);
		
		
		
		
		
		

	}

}
