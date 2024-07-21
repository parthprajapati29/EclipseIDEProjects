package OopsConcepts;

public class AbstaractCall2 extends AbstractDemo{

	public static void main(String[] args) {
		AbstaractCall2 a = new AbstaractCall2();
		a.demo3();
		System.out.println();
		
		AbstractCall a2 = new AbstractCall();
		a2.demo3();
	}

	@Override
	public void demo3() {
		System.out.println("This method belong to abstract call2");	
	}
	
}
