package coreJava;

import java.util.Scanner;

public class oddeven {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number to check if the number is even/odd: ");
		int number = sc.nextInt();
		
		if(number!=0) {
			if(number%2==0) {
				System.out.println("Number is even");
			}else {
				System.out.println("Number is odd");
			}
		}else {
			System.out.println("Number cannot be zero");
		}
		sc.close();		
	}
}
