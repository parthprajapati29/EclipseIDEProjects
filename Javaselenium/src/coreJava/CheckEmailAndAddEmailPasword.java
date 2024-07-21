package coreJava;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckEmailAndAddEmailPasword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> email = new ArrayList<String>();
		ArrayList<String> pwd = new ArrayList<String>();
		boolean b = true;
		while(b) {
			System.out.println("Please enter users email address: ");
			email.add(sc.next());
			System.out.println("Please enter users password: ");
			pwd.add(sc.next());
			System.out.println("Do you still wanna enter users email & password: 'yes' or 'no' ");
			String st = sc.next();

			if(st.equals("yes")) {
				b = true;
			}else {
				b = false;		

			}
	
		}
		
		System.out.println("Enter the email to check the presence in arraylist: ");
		String check = sc.next();

		if(email.contains(check)) {
			System.out.println("Email id exist in arrayList");
		}else {
			System.out.println("Email id doesn't exist in array list || Do you wanna open new accout 'yes' or 'no'");
			String lt = sc.next();

			if(lt.equals("yes")) {
				System.out.println("Enter emailid: ");
				email.add(sc.next());
				System.out.println("Enter password: " );
				pwd.add(sc.next());
				System.out.println("Record creation successful");
			}else {
				System.out.println("Execution end");		

			}
		}
		
		System.out.println("Enter your email address & password for login");
		String emstring = sc.next();
		
		
		for (int i = 0; i < email.size(); i++) {
			System.out.println(email.get(i));
			if(email.get(i).equals(emstring)) {
				System.out.println("Enter your email password for login");
				String pwdstring = sc.next();
				if(pwd.get(i).equals(pwdstring)) {
					System.out.println("suceess ful login");
				}else {
					System.out.println("no successful");
				}
			}
			else {
				System.out.println("User login denied");
			}
		}
		

	}

}
