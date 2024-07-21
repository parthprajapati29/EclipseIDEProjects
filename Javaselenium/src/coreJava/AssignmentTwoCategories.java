package coreJava;

import java.util.Scanner;

public class AssignmentTwoCategories {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("Enter to the all in one recharge center");
		System.out.println("------------------------------------------");
		System.out.println("Please enter respected number option: \n 1. Mobile recharge \n 2. TV recharge");
		int a = sc.nextInt();
		
		switch (a) {
		case 1: {
			System.out.println("Please enter respected number option for mobile recharge : \n 1. Jio recharge \n 2. Vodafone recharge \n 3. Airtel recharge ");
			int b = sc.nextInt();
			switch (b) {
				case 1: {
					System.out.println("Jio recharge successfull");
					break;
				}
				case 2: {
					System.out.println("Vodafone recharge successfull");	
					break;
				}
				case 3: {
					System.out.println("Airtel recharge successfull");
					break;
				}
				default:
					System.out.println("Invalid action entered for mobile recharge");
			}
			break;
		}
		case 2 : {
			System.out.println("Please enter respected number option for TV recharge : \n 1. DTH recharge \n 2. DEN recharge \n 3. TataSky recharge ");
			int c = sc.nextInt();
			switch (c) {
				case 1: {
					System.out.println("DTH recharge successfull");
					break;
				}
				case 2: {
					System.out.println("DEN recharge successfull");	
					break;
				}
				case 3: {
					System.out.println("Tatasky recharge successfull");
					break;
				}
				default:
					System.out.println("Invalid action entered for TV recharge");
			}
			break;
		}
		default:
			System.out.println("Invalid number selection");
		}
		
	}

}
