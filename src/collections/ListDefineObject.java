package collections;

import java.util.ArrayList;
import java.util.List;

// Lists only can contains the defined object
public class ListDefineObject {
	
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		String s = "Hello";
		strings.add(s);
		//strings.add(5); Compilation Error
		strings.forEach((st) -> System.out.println(st));
	}

}
