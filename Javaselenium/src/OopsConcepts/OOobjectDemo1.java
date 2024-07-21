package OopsConcepts;

public class OOobjectDemo1 {

	
	
	static int c = 30;  //global variable
	int data= 50;
	
	//Normal method
	public void add() {
		int a=10, b=20;   //local variable
		System.out.println("a + b: "+(a+b));
	}
	
	//parameterizes method
	public void sub(int a, int b) {
		System.out.println("a + b: "+(a-b));
	}
	
	//return method
	public int mul() {
		int a=4, b=23;
		System.out.println("a*b: "+(a*b));
		return a*b;
	}
	
	
	public static void main(String[] args) {
		
		OOobjectDemo1 obj =  new OOobjectDemo1();
		obj.add();
		obj.sub(5, 8);
		obj.mul();
		
		// in variable/method is non static then it will require object.
		
		System.out.println(obj.data);

		// No object reference required(static variable and object can directly called)
		
		System.out.println(c);
		
	}

}
