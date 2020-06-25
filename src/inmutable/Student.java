package inmutable;

public class Student {
	
    private final int id;
    private final String name;
    private final Age age;
    
	public Student(int id, String name, Age age) {
		this.name = name;
		this.id = id;
		this.age = age.clone();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Age getAge() {
		return age.clone();
	}
}
