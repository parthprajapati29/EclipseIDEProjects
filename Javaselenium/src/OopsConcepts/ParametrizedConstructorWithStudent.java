package OopsConcepts;

public class ParametrizedConstructorWithStudent {
	
	String name;
	int age;
	char div;

	public ParametrizedConstructorWithStudent(String name, int age, char div) {
		this.name =name;
		this.age =age;
		this.div=div;
	}

	public static void main(String[] args) {
		ParametrizedConstructorWithStudent pcws = new ParametrizedConstructorWithStudent("Parth", 30, 'B');
		System.out.println("name is : "+pcws.name);
		System.out.println("name is : "+pcws.age);
		System.out.println("name is : "+pcws.div);
		
		System.out.println();
		ParametrizedConstructorWithStudent pcws1 = new ParametrizedConstructorWithStudent("Drashti", 29, 'A');
		System.out.println("name is : "+pcws1.name);
		System.out.println("name is : "+pcws1.age);
		System.out.println("name is : "+pcws1.div);
		
	}

}
