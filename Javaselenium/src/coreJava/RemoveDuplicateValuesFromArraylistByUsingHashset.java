package coreJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateValuesFromArraylistByUsingHashset {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		String retry;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of any data type: ");
			Object multi = sc.next();
			
			list.add(multi);
			
			System.out.println("Enter 'yes' if you wanna enter again: ");
			retry = sc.next();
			
		} while (retry.equals("yes"));
		
		HashSet set = new HashSet();
		
		for (Object li : list) {
			set.add(li);
		}
		
		System.out.println(set);
	}

}
