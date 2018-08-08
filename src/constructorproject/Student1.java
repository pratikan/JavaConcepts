package constructorproject;

public class Student1 {
	int id;
	String name;

	Student1(int i, String n) {// creating the constructor of Student class
								// that have two parameters
		id = i;
		name = n;

	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student1 s = new Student1(101, "Pratik");
		Student1 s1 = new Student1(102, "anand");
		s.display();
		s1.display();

	}

}
