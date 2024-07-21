package OopsConcepts;

public class AcessSpecifier2 {

	public static void main(String[] args) {
		AcessSpecifier as2 = new AcessSpecifier();
		as2.name();
		as2.mobile();
		as2.age();
		// as2.salary(); not accessible as it is private
		
		System.out.println();
		
		System.out.println(as2.fname);
		
		// not accessible as it is in private
		// System.out.println(as2.lname);
		System.out.println(as2.atmpin);
	}

}
