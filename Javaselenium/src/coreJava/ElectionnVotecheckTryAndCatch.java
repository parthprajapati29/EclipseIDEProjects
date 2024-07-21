package coreJava;

import java.util.Scanner;

public class ElectionnVotecheckTryAndCatch {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		if(age<18) {
			try {
				throw new Exception("Invalid age");
			}catch (Exception e) {
			System.out.println(e);
			}
		}else {
			System.out.println("Valid age");
		}
}
}