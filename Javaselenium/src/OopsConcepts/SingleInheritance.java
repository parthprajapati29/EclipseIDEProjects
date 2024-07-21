package OopsConcepts;

class Super{
	public void democode() {
		System.out.println("Hello");
	}
}

class Base extends Super{
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		Base b = new Base();
		b.democode();
	}
}
