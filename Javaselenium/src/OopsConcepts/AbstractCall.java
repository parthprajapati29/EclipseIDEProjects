package OopsConcepts;

public class AbstractCall extends AbstractDemo{

	public static void main(String[] args) {
		AbstractCall a = new AbstractCall();
		a.demo3();
		a.demo2();
	}
	
	@Override
	public void demo3() {
		System.out.println("This code belong to abstract call class in demo 3");
	}

}
