package OopsConcepts;

public class DefaultConstructorExampleWithStudent {
	
	String name;
	int age;
	char division;

	public DefaultConstructorExampleWithStudent() {
		name = "Parth";
		age = 30;
		division = 'A';
	}

	public static void main(String[] args) {
		DefaultConstructorExampleWithStudent dcews = new DefaultConstructorExampleWithStudent();
		System.out.println("Name is :" +dcews.name);
		System.out.println("Age is :" +dcews.age);
		System.out.println("Division is :" +dcews.division);
	}

}
