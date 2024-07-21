package OopsConcepts;

interface A1{
	public void QualityOfA1();
}
interface B1{
	public void QualityOfB1();
}
class C1 implements A1, B1{
	public void QualityOfC1() {
		System.out.println("Class called from C1");
	}

	@Override
	public void QualityOfB1() {
		System.out.println("interface B1 called");	
	}

	@Override
	public void QualityOfA1() {
		System.out.println("interface A1 called");	
	}
	
}


public class MultipleInheritance {

	public static void main(String[] args) {
		C1 c = new C1();
		c.QualityOfA1();
		c.QualityOfB1();
		c.QualityOfC1();
		
	}

}
