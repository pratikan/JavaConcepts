package constructorproject;

public class ConstructorWithThisKeyword {
	// class vars
	String name;
	int age;

	public ConstructorWithThisKeyword(String name, int age) {// 2--param
																// constructor
		this.name = name;
		this.age = age;

		System.out.println(name);
		System.out.println(age);

	}

	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("tom", 25);

	}

}
