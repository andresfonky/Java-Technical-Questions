package innerclass;

//static inner classes cannot access non-static fields of the outer class.
public class InnerClass {
	public static int temp1 = 1;
	private static int temp2 = 2;
	public int temp3 = 3;
	private int temp4 = 4;

	public static class Inner {
		private static int temp5 = 5;

		private static int getSum() {
			return (temp1 + temp2 + /*temp3 + temp4 + */ temp5);
		}
	}

	public static void main(String[] args) {
		InnerClass.Inner obj = new InnerClass.Inner();
		System.out.println(obj.getSum());
	}

}