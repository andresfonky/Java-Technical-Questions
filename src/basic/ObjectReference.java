package basic;

// Assignment of copy to obj makes copy a reference to obj. 
// Therefore, any change in obj will be reflected in copy also.
public class ObjectReference {
	int a, b;

	ObjectReference() {
		a = 10;
		b = 20;
	}

	public void print() {
		System.out.println("a = " + a + " b = " + b + "n");
	}
	
	public static void copy(ObjectReference obj) {
		obj.a = 0;
	}
	
	public static void createObject(ObjectReference obj) {
		obj = new ObjectReference();
	}
	
	static void giveMeAString(String y) {
		y = "GeeksQuiz";
	}

	public static void main(String[] args) {
		ObjectReference obj = new ObjectReference();
		ObjectReference copy = obj;

		obj.a += 1;
		obj.b += 1;
		System.out.print("values of obj : ");
		obj.print();
		System.out.print("values of copy : ");
		copy.print();
		System.out.println();
		
		copy.a += 1;
		copy.b += 1;
		System.out.print("values of obj : ");
		obj.print();
		System.out.print("values of copy : ");
		copy.print();
		System.out.println();
		
		obj.a = 1;
		obj.b = 1;
		System.out.print("values of obj : ");
		obj.print();
		System.out.print("values of copy : ");
		copy.print();
		System.out.println();
		
		copy(obj);
		System.out.print("values of obj : ");
		obj.print();
		System.out.print("values of copy : ");
		copy.print();
		System.out.println();
		
		ObjectReference obj1 = null;
		createObject(obj1);
		System.out.print("values of obj1 : ");
		try {
			obj1.print();
		} catch (Exception e) {
			System.out.println("null");
		}
		
		String s = null;
		giveMeAString(s);
		System.out.println(s);		
	}
}
