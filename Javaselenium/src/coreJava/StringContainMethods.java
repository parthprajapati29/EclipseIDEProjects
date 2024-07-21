package coreJava;

import java.util.Scanner;

public class StringContainMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of string :");
		String str = sc.nextLine();
		
		String demo = "i have a bike";
		boolean contain = demo.contains(str);
		if(contain) {
			System.out.println("Contain found");
		}else {
			System.out.println("No contain found");
		}
	}

}
