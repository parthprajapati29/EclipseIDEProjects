package OopsConcepts;

public class methodOverloadingdemo {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a * b;
    }
	
	public static void main(String[] args) {
		methodOverloadingdemo c = new methodOverloadingdemo();
		
		System.out.println(c.add(55.43232,6.3232));
	}

}