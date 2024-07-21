package coreJava;

import java.util.HashSet;
import java.util.Scanner;

public class HashsetDuplicateshow {

	public static void main(String[] args) {
		HashSet hSet = new HashSet();
		String retry;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any data type value: ");
			Object mul = sc.next();
			if (hSet.contains(mul)) {
				System.out.println("Value already exist");
			}
			hSet.add(mul);
			System.out.println("Enter 'yes' if you wanna enter again: ");
			retry = sc.next();
			
		} while (retry.equals("yes"));
		
		System.out.println(hSet);
			
	}

}
