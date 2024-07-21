package coreJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashsetNoduplicationInArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		String retry;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of data type integer : ");
			int multi = sc.nextInt();
			
			list.add(multi);
			
			System.out.println("Enter 'yes' if you wanna enter again: ");
			retry = sc.next();
			
		} while (retry.equals("yes"));
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		for (int li : list) {
			set1.add(li);
		}
		
		list.clear();
		
		for (int di : set1) {
			list.add(di);
		}
			
		System.out.println("hash set: "+set1);

		System.out.println("List array: "+list);
		
	}

}
