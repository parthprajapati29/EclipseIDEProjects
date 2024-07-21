package coreJava;

import java.util.Scanner;

public class StringUpperLowercaseMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string value :");
		String str = sc.nextLine();
		
		String upper = str.toUpperCase();
		System.out.println("Upper case value of string is  :" +upper);

		String lower = str.toLowerCase();
		System.out.println("Upper case value of string is  :" +lower);
	}

}
