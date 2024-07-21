package coreJava;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("101", "Hello");
		map.put("102", true);
		map.put("103", 2.15);
		map.put("103", "1233");
		map.put("105", "null");
		
		System.out.println(map);
		System.out.println(map.keySet());
		
		for (Object key : map.keySet()) {
			System.out.println(key+"  "+map.get(key));
		}
		
	}

}
