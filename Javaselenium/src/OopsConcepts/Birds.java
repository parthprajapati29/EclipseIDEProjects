package OopsConcepts;

class ParentBird{
	public void sound() {
		System.out.println("parent sound");
	}
}
class baseBirdSparrow extends ParentBird{
	public void sound() {
		System.out.println("sparrow sound");
	}
}
class baseBirdPigeon extends ParentBird{
	public void sound() {
		System.out.println("Pigeon sound");
	}
}

public class Birds {

	public static void main(String[] args) {
		ParentBird pBird = new ParentBird();
		pBird.sound();
	}

}
