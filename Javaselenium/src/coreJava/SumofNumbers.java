package coreJava;

import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit to find the fibonacci series: ");
		int a = sc.nextInt();
		Boolean number = true;
		int num;

		int sum = 0;  
		
		for(int i = 1; i <= a; ++i)  
		{  
			sum = sum + i;  
		}
		System.out.println("Sum of 0 to "+a+" Numbers is = " + sum);  
		
		if(sum%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
		
		for (int j= 2;j<sum;j++) {
			if(sum%j==0) {
				number = false;
			}
		}
		if (number) {
			System.out.println(sum+" is prime number");
		}else {
			System.out.println(sum+" is not prime number");
		}
	}
}
