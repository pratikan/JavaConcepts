package constructorproject;

public class ThisKeyInConstructor {

	String name = "pratik";

	public  ThisKeyInConstructor() {// Constructor

		this.name = name;
	}

	public static void main(String[] args) {

		ThisKeyInConstructor tc = new ThisKeyInConstructor();
		System.out.println(tc.name);
	}

}
