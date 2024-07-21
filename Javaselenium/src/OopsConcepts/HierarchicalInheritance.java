package OopsConcepts;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Son1 s1 = new Son1();
		s1.QualitySon1();
		s1.QualityFather();
		
		System.out.println();
		
		Son2 s2 = new Son2();
		s2.QualitySon2();
		s2.QualityFather();
	}

}
