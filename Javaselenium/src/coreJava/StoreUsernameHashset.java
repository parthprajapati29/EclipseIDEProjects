package coreJava;

import java.util.HashSet;
import java.util.Scanner;

public class StoreUsernameHashset {

	public static void main(String[] args) {
		HashSet<String> username = new HashSet<String>();
		boolean b = true;
		while (b) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Taking values from user: ");
			String str = scanner.next();
			
			boolean verify = username.add(str);
			if (verify) {
				System.out.println("Value entered in DB");
			} else {
				System.out.println("You have entered duplicate value");
			}
			
			System.out.println("Do you want to add more values type 'yes' or 'no' :");
			String str1 = scanner.next();
			
			if (!str1.equals("yes")) {
				b = false;
				System.out.println(username);
			}
		}
	}

}
