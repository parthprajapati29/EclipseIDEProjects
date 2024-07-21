package coreJava;

import java.util.Scanner;

public class StringConcatMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of variable :");
		int a = sc.nextInt();
		
		System.out.println("Enter value of variable :");
		int b = sc.nextInt();
		
		String con = "Add";
		String cat = " of 2 variable is :";
		String sub = "Subraction";
		
		System.out.println(con.concat(cat)+(a+b));
		System.out.println(sub.concat(cat)+(a-b));

	}

}
