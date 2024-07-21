package coreJava;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of string :");
		String str = sc.nextLine();
		String rev = "";
		
		for (int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Actual string value :" +str);

		System.out.println("Reverse string value :" +rev);

		
		if (rev.equals(str)) {
			System.out.println("String is a palindrome");
		}else {
			System.out.println("String is not a palindrome");
		}

	}

}
