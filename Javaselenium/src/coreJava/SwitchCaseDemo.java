package coreJava;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your day \n1.Mon \n2.tuesday \n3. Wednesday \n4. Thursday \n5. Friday \n6. Saturday \n7. Sunday: ");		
		int day = sc.nextInt();
		
		switch (day) {
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;	
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		
		default:
			System.out.println("Invalid");
		}
	}
}
