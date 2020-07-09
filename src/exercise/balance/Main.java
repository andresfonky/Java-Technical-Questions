package exercise.balance;

public class Main {

	public static void main(String[] args) {
		Comparator c = new  Comparator();
		//System.out.println(c.compare(4, 5));
		String s = "{()}";
		Parse p = new Parse();
		System.out.println(p.isBalanced(s));
		//System.out.println("c"=="c");
		
		int i = 01010;
		System.out.println(i);
	}
}
