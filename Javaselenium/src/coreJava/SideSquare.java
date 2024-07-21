package coreJava;

import java.util.Scanner;

public class SideSquare {

	public static void main(String[] args) {
		boolean b=false;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number: ");
			double d = sc.nextDouble();

			if(d>0) {
				// area of square
				//System.out.println("Area of square is : "+d*d);
				
				//Area of circle
				System.out.println("Area of circle: " + 3.14*d*d);

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
			}else {
				System.out.println("Number is either negative or zero");
			}
		} while (b);
		System.out.println("Execution ended");
	}
}



