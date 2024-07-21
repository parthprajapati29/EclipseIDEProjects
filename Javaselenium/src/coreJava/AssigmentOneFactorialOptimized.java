package coreJava;

import java.util.Scanner;

public class AssigmentOneFactorialOptimized {

	public static void main(String[] args) {
		boolean b=false;
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
			if("yes".equals(st)){
				b=true;
			}else {
				b=false;
			}
			

		} while (b);
		System.out.println("Execution ended");
	}
}	

//Factorial number above 20 is showing answer 0



