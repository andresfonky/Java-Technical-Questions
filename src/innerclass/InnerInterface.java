package innerclass;

public class InnerInterface {
	private int data = 15;

	public static void main(String[] args) {
		Anonymous inner = new Anonymous() {
			int data = 5;

			@Override
			public int getValue() {
				return data;
			}

			@Override
			public int getData() {
				return data;
			}
		};
		InnerInterface outer = new InnerInterface();
		System.out.println(inner.getValue() + inner.getData() + outer.data);
	}
}

interface Anonymous {
	public int getValue();

	public int getData();
}
