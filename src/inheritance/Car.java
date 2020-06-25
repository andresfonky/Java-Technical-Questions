package inheritance;

public abstract class Car implements Comparable<Car> {
	
	protected int engine;
	private static int id = 123;
	
	public Car(int engine) {
		this.engine = engine;
	}
	
	public void run() {
		System.out.println("Car is running");
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}
	
	public int calculate(int i, int j) {
		return i*j;
	}
	
	public int getId() {
		return Car.id;
	}
	
	public void setId(int id) {
		Car.id = id;
	}
}
