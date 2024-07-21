package OopsConcepts;

public class Constructor {

	public Constructor() {
		System.out.println("Constructor called");
	}

	public void car() {
		System.out.println("Car method called");		
	}
	public static void main(String[] args) {
		Constructor c = new Constructor();
		c.car();
	}

}
