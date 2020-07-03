package exception;

import java.io.*;

//If the superclass method declares an exception, subclass overridden method can 
//declare same, subclass exception or no exception but cannot declare parent 
//exception.
public class Inheritance {
	public static void main(String[] args) throws IOException {
		Derived object = new Derived();
		object.display();
	}
}

class Test {
	public void display() throws IOException {
		System.out.println("Test");
	}
}

class Derived extends Test {
	public void display() /*throws Exception*/ throws IOException {
		System.out.println("Derived");
	}
}
