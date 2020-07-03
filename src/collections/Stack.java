package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Stack {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		list.add("GeeksforGeeks");
		Iterator<String> iter = list.iterator(); //Same type as list

		while (iter.hasNext())
			System.out.printf(iter.next() + " ");
		System.out.println(list.size());
	}
}
