package coreJava;

import java.util.Scanner;

public class StringEqualsTo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of variable :");
		String a = sc.nextLine();
		
		String b = "Hello";
		//boolean equal = a.equals(b);
		
		// below ignore case sensitivity 
		boolean equal = a.equalsIgnoreCase(b);

		
		if(equal) {
			System.out.println("Match has been made");
		}else {
			System.out.println("Not matched");
		}

	}

}
