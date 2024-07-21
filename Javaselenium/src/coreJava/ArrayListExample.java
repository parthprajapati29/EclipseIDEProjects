package coreJava;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList data = new ArrayList();
		
		
		// add in list
		data.add("Hello");
		data.add("12344");
		data.add("evening");
		data.add("null");
		data.add("true");
		data.add("false");
		
		System.out.println(data);
		System.out.println(data.get(2));
		
		//add at specific location
		data.add(4,"morning");
		System.out.println(data);
		
		//remove specific location
		data.remove(5);
		System.out.println(data);
		
		for (Object li : data) {
			System.out.println(li);
		}

		// delete all the list
		data.clear();
		System.out.println(data);

		data.add("New data");
		System.out.println(data);

		
		

	}

}
