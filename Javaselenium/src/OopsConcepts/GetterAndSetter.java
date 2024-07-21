package OopsConcepts;

//import javax.management.loading.PrivateClassLoader;

public class GetterAndSetter {

	
	private String name ="XYZ";
	private int age = 1234;
	
	
	//Getter method - read private .protected, and default value
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	// setter method - write private .protected, and default value
	
	public void setName(String name) {
		this.name =name;
	}
	public void setAge(int age1) {
		age =age1;
	}

}
