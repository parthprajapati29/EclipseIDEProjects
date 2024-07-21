package coreJava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number to check if that is prime or not: ");
		int num = sc.nextInt();
		
		Boolean number = true;
		for (int i= 2;i<num;i++) {
			if(num%i==0) {
				number = false;
			}
		}
		if (number) {
			System.out.println(num+" is prime number");
		}else {
			System.out.println(num+" is not prime number");
		}

	}

}
