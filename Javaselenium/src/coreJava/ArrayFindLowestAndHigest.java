package coreJava;

import java.util.Scanner;

public class ArrayFindLowestAndHigest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of arrary of your choice: ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter the arr index of "+i+" :");
			arr[i]= sc.nextInt();
		}
		System.out.print("Array list is: [ ");
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println("]");
		System.out.println();
		
		int min=0;
		int max=0;
		
		for (int k = 0; k < arr.length; k++) {
			if(arr[k]>max) {
				max = arr[k];
			}else {
				min = arr[0];
				if (arr[k]<min) {
					min = arr[k];
				}
			}		
		}
		System.out.println("min value is " +min);
		System.out.println("max value is " +max);
			
	}

}
