package coreJava;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit to find the fibonacci series: ");
		int a = sc.nextInt();
		int num1 = 1;
		int num2 = 0;
		System.out.println(num2);

		for (int i = 0; i < a; i++) {
			int sum = num1+num2;
			num1 = num2;
			num2 =sum;
			System.out.println(sum);
		}

	}

}
