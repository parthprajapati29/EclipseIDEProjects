package coreJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ArraylistHashsetDuplicatefilter {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList list = new ArrayList();
	boolean b= true, c= true;
	
	do {
		System.out.println("Enter your names in DB: : ");
		String str = sc.next();
		list.add(str);
		
		System.out.println("perform new entry 'yes' or 'no': ");
		String rs = sc.next();
		if (rs.equals("yes")) {
			b= true;
		}else {
			b=false;
		}
		
	} while (b);
	
	System.out.println(list);
	
	HashSet hSet = new HashSet();
	for (Object obj : list) {
		hSet.add(obj);
	}
	
	System.out.println(hSet);
	
	do {
		System.out.println("Enter your names: : ");
		String str = sc.next();
		
		if (hSet.contains(str)) {
			System.out.println("User name is present in DB");
		}else {
			System.out.println("Not present in DB");
		}
		
		System.out.println("perform new entry 'yes' or 'no': ");
		String rs = sc.next();
		if (rs.equals("yes")) {
			c= true;
		}else {
			c=false;
		}
		

	} while (c);

	}
	

}
