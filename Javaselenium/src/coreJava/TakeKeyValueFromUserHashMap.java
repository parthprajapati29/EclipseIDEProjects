package coreJava;

import java.util.HashMap;
import java.util.Scanner;

public class TakeKeyValueFromUserHashMap {

	public static void main(String[] args) {
		HashMap<String, String> data = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		String retry;
		
		do {
			System.out.println("Enter username in db: ");
			String username =sc.next();
			System.out.println("Enter password in db: ");
			String password = sc.next();
			
			data.put(username, password);
			
			System.out.println("Enter 'yes' or 'no' if you wanna retry: ");
			retry= sc.next();	
		} while (retry.equals("yes"));
		
		System.out.println("----------------------");

		System.out.println("Enter creds for login: ");
		System.out.println("Username: ");
		String usr = sc.next();
		System.out.println("Password: ");
		String pwd = sc.next();
		
		if (data.containsKey(usr) && data.get(usr).equals(pwd)) {
			System.out.println("Acess Granted");
		} else {
			System.out.println("Acess Denied");
		}
	}
}

