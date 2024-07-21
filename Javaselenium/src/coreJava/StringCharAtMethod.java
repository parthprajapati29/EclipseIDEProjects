package coreJava;

import java.util.Scanner;

public class StringCharAtMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string value :");
		String str = sc.nextLine();
		
		int len = str.length();
		
		char first = str.charAt(0);
		System.out.println("First charcter of string is  :" +first);
		
		char last = str.charAt(len -1);
		System.out.println("First charcter of string is  :" +last);
		
		//print index
		System.out.println("Index location in string is : " +(len-1));


	}

}
