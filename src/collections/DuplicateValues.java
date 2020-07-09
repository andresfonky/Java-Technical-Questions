package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// How Collections deals with duplicates values
public class DuplicateValues {
	
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		String s = "Hello";
		strings.add(s);
		strings.add(s);
		strings.add("Yes");
		System.out.print("List: ");
		strings.forEach((st) -> System.out.print(st + ", "));
		System.out.println();
		
		Set<String> sets = new HashSet<String>(); //No duplicates values
		sets.add(s);
		sets.add(s); //Duplicated
		sets.add("Hello"); //Duplicated
		sets.add("Yes");
		System.out.print("Set: ");
		sets.forEach((st) -> System.out.print(st + ", "));
		System.out.println();
		
		HashMap<Integer, String> hashs = new HashMap<>(); //No duplicates hash values
		hashs.put(0, s);
		hashs.put(1, s);
		hashs.put(1, "No"); //Updates value where key = 1
		hashs.put(1, s); //Updates value where key = 1
		hashs.put(2, "Yes");
		System.out.print("Hash: ");
		hashs.forEach((n, st) -> System.out.print("(key: " + n + " value: " + st + "), "));
	
	}

}
