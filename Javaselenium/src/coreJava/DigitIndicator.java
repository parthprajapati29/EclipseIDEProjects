package coreJava;

import java.util.Scanner;

public class DigitIndicator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to check digit count: ");
		int digit = sc.nextInt();
		
		if(digit>0 && digit<=9) {
			System.out.println("One digit");
		}else if(digit>=10 && digit<=99) {
			System.out.println("two digit");
		}else if(digit>=100 && digit<=999) {
			System.out.println("three digit");
		}else if(digit>=1000 && digit<=9999) {
			System.out.println("Four digit");
		}
		else {
			System.out.println("invalid/ out of scope value");
		}
		sc.close();
	}
}
