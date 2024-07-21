spackage coreJava;

import java.util.Scanner;

public class ArrayEvenOdd {

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
		
		for (int k = 0; k < arr.length; k++) {
			if(arr[k]%2==0) {
				System.out.println(arr[k]+ " is even number");
			}else {
				System.out.println(arr[k]+ " is odd number");

			}
		}

	}
}
