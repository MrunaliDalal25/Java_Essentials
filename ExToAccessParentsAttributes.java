package Inheritance;

public class ExToAccessParentsAttributes {
	String type="Birds";
}
class ChildCategory extends ExToAccessParentsAttributes {
	String type="Parrot";
	public void printType() {
		System.out.println(super.type);
}
}
class ParentsMain{
	public static void main(String[] args) {
    ChildCategory c= new ChildCategory();
    c.printType();
    	
	}

}
