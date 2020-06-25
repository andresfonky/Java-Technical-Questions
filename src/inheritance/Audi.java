package inheritance;

public class Audi extends Car{
	
	private String model;
	
	public Audi(int engine, String model) {
		super(engine);
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void run() {
		System.out.println("Audi " + this.model + " is running safely with " + this.engine);
	}
	
	public void doNothing(String s, int i) {
		System.out.println("String: " + s + " i: " + i);
	}
	
	public void doNothing(int i, String s) {
		System.out.println("i: " + i + " String: " + s );
	}
	
	public void calculate(int i) {
		int p = super.calculate(i, i);
		System.out.println(p*i);
	}
	
	@Override
	public int compareTo(Car o) {
		return this.engine - o.getEngine();
	}

	@Override
	public boolean equals(Object o) {
		if(o == this)
			return true;
		if(o == null || !(o instanceof Audi))
			return false;
		Audi a = (Audi) o;
		return (this.engine == a.getEngine() && this.model.equals(a.getModel()));
		
	}
	
}
