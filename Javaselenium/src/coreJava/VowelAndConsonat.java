package coreJava;

import java.util.Scanner;

public class VowelAndConsonat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of string :");
		String str = sc.nextLine();
		
		
		char ch = str.toLowerCase().charAt(0);
		
		if(ch=='a' || ch=='e'|| ch=='i' || ch=='o'  || ch=='u') {
			System.out.println("First letter is a vowel which is :" +ch);
		}else {
			System.out.println("First letter is a consonant which is :" +ch);
		}

	}

}
