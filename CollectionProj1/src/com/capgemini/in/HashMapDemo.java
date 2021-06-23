package com.capgemini.in;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
	
		HashMap hm=new HashMap();
		hm.put(12,"Prudhvi");
		hm.put(12, "Rajeev");
		hm.put('A',true);
		hm.put(12.5,100);
		hm.put(null,null);
		
		System.out.println(hm);
		
		System.out.println("size of HashMap :"+hm.size());
		System.out.println("contains key 12.5?"+hm.containsKey(12.5));
		System.out.println("containe value 100?"+hm.containsValue(100));
		System.out.println("HashMap object empty?"+hm.isEmpty());
		System.out.println("Value for key:'A':"+hm.get('A'));
		
		hm.remove(null);
		
		System.out.println(hm);
		
		hm.replace(12.5,299);
		System.out.println(hm);
		hm.clear();
		
		System.out.println(hm);

	}

}
