package OopsConcepts;


interface A11{
	public void QualityOfA1();
}
interface B11 extends A11{
	public void QualityOfB1();
}

interface C11 extends A11{
	public void QualityOfC1();
}
class D11 implements B11, C11{
	
	public void QualityOfD1() {
		System.out.println("class D1 called");
	}

	@Override
	public void QualityOfA1() {
		System.out.println("Interface A1 called");
		
	}

	@Override
	public void QualityOfB1() {
		System.out.println("Interface B1 called");
	}

	@Override
	public void QualityOfC1() {
		System.out.println("Interface C1 called");	
	}
	
}

public class Hybrid {
  
	public static void main(String[] args) {
		D11 d = new D11();
		d.QualityOfA1();
		d.QualityOfB1();
		d.QualityOfC1();
		d.QualityOfD1();
	}

}


