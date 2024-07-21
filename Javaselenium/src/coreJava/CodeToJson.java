package coreJava;

import java.util.Scanner;

public class CodeToJson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of product id 1 :");
		String productId1 = sc.nextLine();
		System.out.println("Enter value of product name 1 :");
		String productName1 = sc.nextLine();
		System.out.println("Enter value of product id 2 :");
		String productId2 = sc.nextLine();
		System.out.println("Enter value of product name 2 :");
		String productName2 = sc.nextLine();
		
		System.out.println("[\n\t{\n\t\"product1\":\""+productId1+"\",\n\t\"productname1\":\""+productName1+"\",\n\t\"product2\":\""+productId2+"\",\n\t\"productname2\":\""+productName2+"\"\n\t}\n]");
		
	}
}

