package collections;

import java.util.TreeSet;

// A TreeSet sorts the data in ascending order that is inserted in it. Therefore, 
// the output string contains all the strings arranged in ascending order. A 
// TreeSet does not contain any duplicate element as it is a set. 
public class Treeset {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("Geeks");
		treeSet.add("for");
		treeSet.add("Geeks");
		treeSet.add("GeeksforGeeks");

		for (String temp : treeSet)
			System.out.printf(temp + " ");

		System.out.println("\n");
	}

}
