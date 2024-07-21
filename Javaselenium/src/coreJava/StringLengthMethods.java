package coreJava;

import java.util.Scanner;

public class StringLengthMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string :");
		String st = sc.nextLine();
		
		int len = st.length();	
		System.out.println("The length of the string is :" +len);

	}

}
