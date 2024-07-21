package OopsConcepts;

import java.util.Scanner;

public class MethodOverloading {
	
	public void EmailAndPhoneNo(String email) {
		System.out.println("Email is entered");
	}
	
	public void EmailAndPhoneNo(int phone) {
		System.out.println("phone is entered");
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter email or phone number: ");
		String emailorphoneString = scanner.next();
		
		try {
			int phone = Integer.parseInt(emailorphoneString);
			m.EmailAndPhoneNo(phone);
		} catch (Exception e) {
			m.EmailAndPhoneNo(emailorphoneString);
		}

	}

}
