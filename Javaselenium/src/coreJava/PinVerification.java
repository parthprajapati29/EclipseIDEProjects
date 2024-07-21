package coreJava;

import java.util.Scanner;

public class PinVerification {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		for (int i=2; i>=0;i--) {
			System.out.println("Enter your atm pin : ");
			int userpin = sc.nextInt();
			int pin =1993;
			if(userpin>=1000 && userpin<=9999) {
				if(pin==userpin){
					System.out.println("Acess Granted ");
					break;
				}
				else if(i==0) {
					System.out.println("Please contact  to your nearst branch");
				}
				else {
					System.out.println("Denied");
					System.out.println(i+" attempt left");
					
				}
			}else {
				System.out.println("Pin cannot be greater than 1000 or less than 9999");
			}
		}
		sc.close();
	}
}

/*
 1. Enter pin
 2. There will be 3 attempt for user only
 3. Show error of 3 wrong attempt 
 4. if user enters wrong pin show validation message
 */


