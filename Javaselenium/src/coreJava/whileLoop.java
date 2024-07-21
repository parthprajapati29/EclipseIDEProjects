package coreJava;

public class whileLoop {

	public static void main(String[] args) {
		
		// incremental
		int i =1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		// decrement
		int j=10;
		while (j>=0) {
			System.out.println(j);
			j--;
		}
		
		//infinite print
		while (true) {
			System.out.println("infintite");
			break;
		}
		
		System.out.println("outerbond unreach able");
	}

}
