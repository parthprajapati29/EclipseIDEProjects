package coreJava;

import java.util.Scanner;

public class PinValidation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any OTP:");
		int otp = sc.nextInt();
		
		int a= 12345;
		if(a==otp) {
			System.out.println("otp validated");
		}else {
			System.out.println("Invalid OTP");
		}
		sc.close();
	}
}
