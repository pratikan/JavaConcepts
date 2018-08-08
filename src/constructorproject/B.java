package constructorproject;

public class B extends SuperkeywordInConstructor {

	public B() {
		super();
		System.out.println("child class constructor");

	}

	public B(int i) {
		super(i);

	}

	public B(int i, int j) {
		super(i, j);

	}

	public static void main(String[] agrs) {
		B b = new B();
		B b1 = new B(10);
		B b2 = new B(10, 20);

	}
}
