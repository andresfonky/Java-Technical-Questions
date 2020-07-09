package basic;

// && operator is evaluated from left to right. If the first expression 
// of && operator evaluates to false, then the second operator is not evaluated.
public class AndOperatorOrder {
	public static void main(String[] args) {
		int temp = 40;
		//if (temp == 30 ||| temp / 0 == 4 /* Exception */) {
		if (temp == 30 /*false*/ && temp / 0 == 4 /* Not evaluated */) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}
	}
}
