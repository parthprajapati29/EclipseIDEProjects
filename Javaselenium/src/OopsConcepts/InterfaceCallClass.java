package OopsConcepts;

public class InterfaceCallClass implements InterfaceDemo{

	public static void main(String[] args) {
		InterfaceCallClass ifCc = new InterfaceCallClass();
		ifCc.demo();
		System.out.println("value of a :"+a);
	}

	@Override
	public void demo() {
		System.out.println("This is interfaceCallclass demo");
		
	}

}
