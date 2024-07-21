package coreJava;

import java.util.Scanner;

public class AssignmentOneFactorial {

	public static void main(String[] args) {
		boolean b=true;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter factorial number: ");
			int f = sc.nextInt();
			int j =1;

			for (int i=1; i <= f; i++) {
					j = j*i;
				}
			System.out.println("the factorial of "+ f +" is :" +j);
			
			System.out.println("Do you want to perform the operation again then type 'yes' or else type 'no' :");
			String st = sc.next();
			switch (st) {
				case "yes": {
					b=true;
					break;
				}
				case "no": {
					b=false;
					break;
				}
			default:
				System.out.println("invalid action");
			}
		} while (b);
		System.out.println("Execution ended");
	}
}

//Factoral number above 20 is showing answer 0



