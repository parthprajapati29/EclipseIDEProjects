package OopsConcepts;

public class ParametrizedConstuctorDemo {

	public ParametrizedConstuctorDemo(int a, int b) {
		System.out.println("Addition of a + b :" +(a+b));
	}

	public static void main(String[] args) {
		ParametrizedConstuctorDemo pcd = new ParametrizedConstuctorDemo(2, 2);
		
	}

}
