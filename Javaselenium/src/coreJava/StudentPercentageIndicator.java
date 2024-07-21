package coreJava;

import java.util.Scanner;

public class StudentPercentageIndicator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter student percentage to check the grade: ");
		double digit = sc.nextDouble();
		
		if(digit>0 && digit<=34.99) {
			System.out.println("Failed");
		}else if(digit>=35 && digit<=49.99) {
			System.out.println("seconf");
		}else if(digit>=50 && digit<=69.99) {
			System.out.println("first class");
		}else if(digit>=70 && digit<=99.99) {
			System.out.println("Distinction");
		}
		else {
			System.out.println("invalid/ out of scope value");
		}
		sc.close();
	}
}