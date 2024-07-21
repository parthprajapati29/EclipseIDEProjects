package coreJava;

import java.util.Scanner;

public class ExceptionHandlingThrow {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		if(age<18) {
			throw new Exception("Invalid age for driving");
		}else {
			System.out.println("Valid Age");
		}
	}

}
