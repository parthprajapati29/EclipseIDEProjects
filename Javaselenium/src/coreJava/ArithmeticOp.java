package coreJava;

import java.util.Scanner;

public class ArithmeticOp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter value of b: ");
		int b = sc.nextInt();
		System.out.println("Enter operation that you wanna perform \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Mod(%):");
		int c = sc.nextInt();
		
		if(c == 1) {
			System.out.println("a+b = "+(a+b));
		}
		else if(c == 2) {
			System.out.println("a-b = "+(a-b));
		}
		else if(c == 3) {
			System.out.println("a*b = "+(a*b));
		}
		else if(c == 4) {
			System.out.println("a/b = "+(a/b));
		}
		else if(c == 5) {
			System.out.println("a%b = "+(a%b));
		}
		else {
			System.out.println("Invalid arithmetic operator");
		}
	}

}
