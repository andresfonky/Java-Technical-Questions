package interfaces;

//Interfaces can only be public
public interface Modifiers {
	public int calculate();

	/*protected*/ public interface NestedInterface {
		public void nested();
	}
}