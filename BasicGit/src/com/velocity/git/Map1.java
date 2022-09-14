package com.velocity.git;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(101, "Kiran");
		map.put(102, "Sandhya");
		map.put(103, "Raj");
		map.put(104, "Ajay");
		map.put(105, "Laddu");
		
		Set<Integer> keys = map.keySet();
		
		Iterator<Integer> itr = keys.iterator();
		
		while (itr.hasNext()) 
		{
			int x=itr.next();
			System.out.println(x+" : "+ map.get(x));
		}
	}

}
