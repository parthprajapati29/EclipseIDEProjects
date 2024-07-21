package coreJava;

import java.util.ArrayList;
import java.util.Scanner;

public class AddEmailToCheckIfEmailIsExistingInArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> email = new ArrayList<String>();
		String str;
		String retry;
		do {
			System.out.println("Please enter users email address:  ");
			email.add(str = sc.next());
			System.out.println("Do you want to retry enter users email value again: 'yes' or 'No'");
			retry = sc.next();
			
		} while (retry.equals("yes"));
		
		System.out.println("Enter email to validate: ");
		String validate =sc.next();
		
//		for (String em : email) {
//			if(em.equals(validate)) {
//				System.out.println("Email is existing");
//			}
//		}
		
		// contain is array list method
		if(email.contains(validate)) {
			System.out.println("Email exist");
		}else {
			System.out.println("Email doesn't exist");
		}

	}

}
