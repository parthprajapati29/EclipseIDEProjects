package OopsConcepts;


class Animal{
	public void makesound() {
		System.out.println("The animal makes sound");
	} 
}

class methodsOverridingdemo extends Animal {
	public void makesound() {
		System.out.println("Meow");
	}
	
	public static void main(String[] args) {
		methodsOverridingdemo c = new methodsOverridingdemo();
		c.makesound();
}
}

