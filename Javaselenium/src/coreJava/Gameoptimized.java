package coreJava;

import java.util.Scanner;

public class Gameoptimized {

	public static void main(String[] args) {
		int attempt=0;
		int maxattempt=3;
		boolean b=true;
		while(true) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter input action 'attack', 'defend', 'escape' :");
			String s=sc.nextLine();
		
			if("attack".equals(s)||"defend".equals(s)||"escape".equals(s)) {
				System.out.println("Action accepted :" +s);
			}else {
				System.out.println("Invalid action :" +s);
				attempt++;
				if(attempt>=maxattempt) {
					System.out.println("Gamer Over too many attempts");
					break;
				}
			}
		}

	}

}
