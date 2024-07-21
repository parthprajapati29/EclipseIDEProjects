package coreJava;

import java.util.Scanner;

public class PinWithInfinitecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the Pin: ");
			int e = sc.nextInt();
			int userpin=1234;
			
			if(userpin==e) {
				System.out.println("Access Granted");
				break;
			}else {
				System.out.println("Access Denied");
			}
		}
				

	}

}
