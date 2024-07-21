package coreJava;

import java.util.Scanner;

public class Forlooptable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers for input : ");
		int j = sc.nextInt();
		
		
		for(int i=1;i<=12;i++) {
			System.out.println(j+"*"+i+"="+i*j);
			//System.out.println(" = " +(i*j));
		}
		
	}
}
