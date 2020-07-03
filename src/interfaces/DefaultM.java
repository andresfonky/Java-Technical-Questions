package interfaces;

public interface DefaultM {
	
	default int result() {
		return 5;
	}
	
	default int result(int i) {
		return 5+i;
	}
}
