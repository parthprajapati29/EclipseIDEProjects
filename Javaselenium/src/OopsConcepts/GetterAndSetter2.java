package OopsConcepts;

public class GetterAndSetter2 {

	public static void main(String[] args) {
		GetterAndSetter gs = new GetterAndSetter();
		System.out.println("name: "+gs.getName());
		System.out.println("age: "+gs.getAge());
		
		System.out.println();
		gs.setName("Marvel");
		gs.setAge(30);
		
		System.out.println("name: "+gs.getName());
		System.out.println("age: "+gs.getAge());
	}

}
