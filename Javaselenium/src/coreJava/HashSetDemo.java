package coreJava;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet data = new HashSet();
		data.add(12345);
		data.add("Hello");
		data.add(true);
		data.add(null);
		data.add(null);
		data.add(12.345);
		
		System.out.println(data);
		
		data.remove(null);
		System.out.println(data);
		
		Iterator it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		data.clear();
		System.out.println(data);

		
	}

}
