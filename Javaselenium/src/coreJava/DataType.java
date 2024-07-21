package coreJava;

import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of tom:");
		int tomAge = sc.nextInt();
		System.out.println("Enter the age of cat:");
		int catAge = sc.nextInt();
		
		if(tomAge!=catAge) {
			if(tomAge > catAge) {
				System.out.println("tom age is greater");
			}else {
				System.out.println("cat age is greater");
			}
		}else {
				System.out.println("they age of tom and cat are the same");
		}
		
		sc.close();
	}
}
