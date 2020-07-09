package exception;

import java.io.IOException;
import java.util.EmptyStackException;

// Only one exception is catched, then skip
// From more specific to more general
public class CatchException {

	public static void main(String[] args) {
		try {
			System.out.printf("%d", 1);
			throw (new IOException());
		//} catch (Exception e) { Exception handled. The other exceptions are Unreachable (Compilation error)
		} catch (IOException e) {
			System.out.printf("%d", 2);
		} catch (EmptyStackException e) {
			System.out.printf("%d", 3);
		} catch (Exception e) {
			System.out.printf("%d", 4);
		} finally {
			System.out.printf("%d", 5);
		}
	}
}