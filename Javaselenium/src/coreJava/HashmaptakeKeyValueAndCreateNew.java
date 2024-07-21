package coreJava;

import java.util.HashMap;
import java.util.Scanner;

public class HashmaptakeKeyValueAndCreateNew {

	public static void main(String[] args) {
		HashMap<Integer, String> data = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		String retry;
		
		do {
			System.out.println("Enter Customerid in db: ");
			int customerId =sc.nextInt();
			System.out.println("Enter password in db: ");
			String password = sc.next();
			
			data.put(customerId, password);
			
			System.out.println("Enter 'yes' or 'no' if you wanna retry: ");
			retry= sc.next();	
		} while (retry.equals("yes"));
		
		System.out.println("----------------------");

		System.out.println("Check if user exist: ");
		System.out.println("CustomerId : ");
		int usr = sc.nextInt();
//		System.out.println("Password: ");
//		String pwd = sc.next();
		
		if (!data.containsKey(usr)) {
			System.out.println("Customer doesn't exist | Do you want to  create new customer then enter 'yes' or 'no' :");
			String input = sc.next();
			if (input.equals("yes")) {
				System.out.println("Enter cutomerid:");
				int customerId =sc.nextInt();
				System.out.println("Enter password: ");
				String password = sc.next();
				
				data.put(customerId, password);
				System.out.println("New Entry updated in Db");
				
				System.out.println(data);
			}
		} else {
			System.out.println("Customer exist");
		}
	}

}
