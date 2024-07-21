package coreJava;

import java.util.Scanner;

public class PinwithDoWhileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean p = true;

		do {
			System.out.println("Enter your pin: ");
			int userpin = sc.nextInt();
			int pin = 5555;
			if(userpin==pin) {
				System.out.println("Granted");
				break;
			}else {
				System.out.println("Denied");
			}
			System.out.println("Do you want to continue: 'yes' or 'No' :");
			String o =sc.next();
			switch (o) {
			case "yes": {
				p=true;
				break;
			}
			case "No": {
				p=false;
				break;
			}
			default:
				System.out.println("Invalid value has be selected");
				p=false;
				break;
			}

		} while (p);

	}

}
