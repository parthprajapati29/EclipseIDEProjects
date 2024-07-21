package coreJava;

import java.util.Scanner;

public class AuthMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of username :");
		String usr = sc.nextLine();
		System.out.println("Enter value of password :");
		String pw = sc.nextLine();

		if("parth1".equals(usr) && "qwerty".equals(pw)) {
			System.out.println("Access granted");
		}else {
			System.out.println("Access Denied");
		}

	}

}
