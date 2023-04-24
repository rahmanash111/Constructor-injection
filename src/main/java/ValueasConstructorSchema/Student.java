package ValueasConstructorSchema;

public class Student {

	private String name;
	private int age;
	private double marks;
	
	public Student(String name, int age, double marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getMarks() {
		return marks;
	}
	
	
}
