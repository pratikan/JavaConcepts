package constructorproject;

public class SuperkeywordInConstructor {

	public   SuperkeywordInConstructor() {//constructor overloading---more the one constructor with diff parameter list
		System.out.println("parents class constructor");
	}

	public SuperkeywordInConstructor(int i) {
		System.out.println("parents class constructor with value is " + i);
	}

	public SuperkeywordInConstructor(int i, int j) {
		System.out.println("parents class constructor with value is " + i);
		System.out.println("parents class constructor with value is " + j);
	}

}
