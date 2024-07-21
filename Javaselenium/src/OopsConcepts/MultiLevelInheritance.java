package OopsConcepts;

class GrandParent{
	public void QualityOFGrandParent() {
		System.out.println("This code is of grand parent");
	}
}
class Parent extends GrandParent{
	public void QualityOFParent() {
		System.out.println("This code is of parent");
	}
}
class child extends Parent{
	public void QualityOFChild() {
		System.out.println("This code is of child");
	}
}

public class MultiLevelInheritance { // calling class

	public static void main(String[] args) {
		child c = new child();
		c.QualityOFChild();
		c.QualityOFParent();
		c.QualityOFGrandParent();
		
		System.out.println();
		
		Parent p = new Parent();
		p.QualityOFParent();
		p.QualityOFGrandParent();
		
		System.out.println();
		
		GrandParent gP = new GrandParent();
		gP.QualityOFGrandParent();
		
	}
}
