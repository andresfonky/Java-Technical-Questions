package primitive;

public class NumberValues {

	public static void main(String args[]) {
		short s = 0;
		int x = 07;
		//int y = 08; If a number starts with 0, is a an octal (0-7)
		int z = 112345;

		s += z; //Number bigger than a short, so is negative
		System.out.println("" + x + " " + /*y + */ s);
	}

}
