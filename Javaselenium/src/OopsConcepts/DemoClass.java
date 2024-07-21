package OopsConcepts;

class A{
	public void method() {
		System.out.println("class A printed");
	}
}

class b{
	public static void main(String[] args) {
		System.out.println("Class B");
	}
	
}

public class DemoClass {

	public static void main(String[] args) {
		A a = new A();
		a.method();
		
		
		// Accessing from other class with super in same package
		Super s = new Super();
		s.democode();
	}

}
