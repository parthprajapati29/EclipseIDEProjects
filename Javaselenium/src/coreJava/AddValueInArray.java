package coreJava;

import java.util.Scanner;

public class AddValueInArray {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter length of the array:");
		int len = sc.nextInt();
	
		int[] arr = new int[len];
		
		System.out.println("Enter array elements value: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Display array");
		for(int i=0; i< arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
