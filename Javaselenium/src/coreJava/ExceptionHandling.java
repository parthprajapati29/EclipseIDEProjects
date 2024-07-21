package coreJava;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		int a=10, b=0;
		
		try {
			System.out.println("Hello");
			System.out.println(a/b);
			System.out.println("everyone");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
	
	String str1 = null;
	try {
		System.out.println(str1.toUpperCase());
	} catch (Exception e) {
		System.out.println("String value is null");
	}
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter phone number & username: ");
		
	String str2 = scanner.next();
	try {
		int i = Integer.parseInt(str2);
		System.out.println(i);
	} catch (Exception e) {
		System.out.println("Exception");
	}finally {
		Thread.sleep(5);
		System.out.println("Finally executed");
	}
	
	}
}

