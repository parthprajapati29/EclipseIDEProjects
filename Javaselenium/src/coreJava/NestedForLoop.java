package coreJava;

public class NestedForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=52;i++) {
			System.out.println();
			System.out.println("Week: "+i);
			for (int j = 1; j <=7; j++) {
				switch (j) {
				case 1: {
					System.out.println("Monday");
					break;
				}
				case 2: {
					System.out.println("Tuesday");
					break;
				}
				case 3: {
					System.out.println("Wednesday");
					break;
				}
				case 4: {
					System.out.println("thursday");
					break;
				}
				case 5: {
					System.out.println("friday");
					break;
				}
				case 6: {
					System.out.println("saturday");
					break;
				}
				case 7: {
					System.out.println("sunday");
					break;
				}
				default:
					System.out.println("invalid day");
				}
			}
		}
	}

}
