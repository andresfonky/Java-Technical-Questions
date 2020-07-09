package exception;

import java.io.*;

// If the superclass method declares an exception, subclass overridden method can 
// declare same, subclass exception or no exception but cannot declare parent 
// exception.

// The exception thrown by the overriding method should not be new or 
// more broader checked exception. In the code above, Exception is more 
// broader class of checked exception than IOException, 
// so this results in compilation error.
class DerivedInheritance {
	public void display() throws IOException {
		System.out.println("Test");
	}
}

public class Inheritance extends DerivedInheritance {
	
	public void display() /*throws Exception*/ throws IOException {
		System.out.println("Derived");
	}
	public static void main(String[] args) throws IOException {
		Inheritance object = new Inheritance();
		object.display();
	}
}