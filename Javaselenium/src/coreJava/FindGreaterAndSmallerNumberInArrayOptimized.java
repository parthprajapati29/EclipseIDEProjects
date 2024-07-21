package coreJava;

import java.util.Arrays;
import java.util.Scanner;

public class FindGreaterAndSmallerNumberInArrayOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of an array: ");
		int len = sc.nextInt();
		
		 int arr[] = new int[len];
		 System.out.println("Enter value of array elements :");
		 
		 for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		 Arrays.sort(arr);
		 
		 System.out.println("Smallest value: " +arr[0]);
		 System.out.println("Largest value: " +arr[arr.length-1]);
		 sc.close();
	}


}