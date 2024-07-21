package coreJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class iteratorMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings with space: ");
		String str = sc.next();
		
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			list.add(sc.next());
		}
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
				System.out.println(itr.next());
		}
	}

}
