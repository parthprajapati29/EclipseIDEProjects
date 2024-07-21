package OopsConcepts;

public class AcessSpecifier {
	
	public void name() {
		System.out.println("Name is called");
	}
	private void salary() {
		System.out.println("salary is called");
	}
	protected void mobile() {
		System.out.println("Mobile is called");
	}
	void age() {
		System.out.println("age is called");
	}

	public String fname = "Parth ";
	private String lname = "Prajapati";
	protected int atmpin = 1234;
	
	
	public static void main(String[] args) {
		AcessSpecifier as = new AcessSpecifier();
		as.name();
		as.salary();
		as.mobile();
		as.age();
		
		System.out.println();
		System.out.println(as.fname);
		System.out.println(as.lname);
		System.out.println(as.atmpin);
	
	}

}
