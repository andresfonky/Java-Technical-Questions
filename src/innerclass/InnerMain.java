package innerclass;

public class InnerMain {
	private int data = 10;

	class Inner {
		private int data = 20;

		private int getData() {
			return data;
		}

		public void method(String[] args) {
			Inner inner = new Inner();
			System.out.println(inner.getData());
		}
	}

	private int getData() {
		return data;
	}

	public static void main(String[] args) {
		InnerMain innerMain = new InnerMain();
		InnerMain.Inner inner = innerMain.new Inner();
		System.out.printf("%d", innerMain.getData());
		inner.method(args);
	}
}