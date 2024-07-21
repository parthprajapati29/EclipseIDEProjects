package coreJava;

import java.util.Scanner;

public class AgeIndicator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age here: ");
		int age = sc.nextInt();
		
		if(age>0 && age<=12) {
			System.out.println("Kiddo");
		}else if(age>=13 && age<=18) {
			System.out.println("Teenager");
		}else if(age>=19 && age<=60) {
			System.out.println("Adult");
		}else if(age>=61 && age<=100) {
			System.out.println("old");
		}
		else {
			System.out.println("The age you have entered is invalid");
		}
		sc.close();
	}
}
