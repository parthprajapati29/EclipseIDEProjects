package AcessSpecifierspackage;

import OopsConcepts.AcessSpecifier;

public class AcessSpecifier3 extends AcessSpecifier {

	public static void main(String[] args) {
		AcessSpecifier3 as3 = new AcessSpecifier3();
		as3.name();
		// not accessible as it is declared private
		// as3.salary(); 
		
		as3.mobile();
		
		//not accessible as it has not access specifier and it is default so cannot access in other package(it can only be access in same package)
		//as3.age(); 
		
		System.out.println();
		System.out.println(as3.fname);
		
		// not accessible as it is in private
		// System.out.println(as3.lname);
		System.out.println(as3.atmpin);
		
	}

}
