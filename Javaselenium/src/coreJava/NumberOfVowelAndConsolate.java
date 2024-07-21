package coreJava;

import java.util.Scanner;

public class NumberOfVowelAndConsolate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of string: ");
		String str = sc.nextLine();
		int v=0, c=0, num=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.toLowerCase().charAt(i);
			if(ch=='a' || ch=='e'|| ch=='i' || ch=='o'  || ch=='u') {
				v++;
			}
			else if (ch=='0' || ch=='1'||ch=='2' || ch=='3' || ch=='4' || ch=='5'||ch=='6' || ch=='7' || ch=='8' || ch=='9') {
				num++;
			}
			else {
				c++;
			}
		}
		System.out.println("Vowel count : "+v);
		System.out.println("Consolate count : "+c);
		System.out.println("total count : "+num);
	}

}
