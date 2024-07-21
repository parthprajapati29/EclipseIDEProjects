package coreJava;

import java.util.HashMap;
import java.util.Scanner;

public class StudentEnrrollmentHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> data = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		
		boolean b= true;
		while (b) {
			System.out.println("Enter student rollno in db: ");
			int rollno =sc.nextInt();
			
			System.out.println("Enter student name in db: ");
			String name = sc.next();
			
			data.put(rollno, name);
			System.out.println("Do you wanna perform the add operation again");
			String op = sc.next();
			
			if (op.equals("yes")) {
				b=  true;
			}else {
				b= false;
			}
		}
		System.out.println(data);
	}

}
