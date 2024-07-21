package coreJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFindPrimeNumberTillFifteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the prime numbers limit that you wanna have: ");
		int lim = sc.nextInt();
		
		ArrayList<Integer> prime = new ArrayList<Integer>();
		
		for (int i = 2; i < lim; i++) {
			boolean b = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					b = false;
				}
			}
			if(b) {
				prime.add(i);
			}
		}
		System.out.println("Prime:" +prime);

		System.out.println("Prime number  up to "+lim+" is ");
		for (Integer pri : prime) {
			System.out.println(pri);
		}
	}
}
