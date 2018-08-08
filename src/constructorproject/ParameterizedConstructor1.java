package constructorproject;

public class ParameterizedConstructor1 {

	private int var;

	public ParameterizedConstructor1() {// default Constructor
		this.var = 10;
	}

	public ParameterizedConstructor1(int num) {// parameterized constructor
		this.var = num;
	}

	public int getValue1() {
		return var;

	}

	public static void main(String[] args) {
		ParameterizedConstructor1 obj = new ParameterizedConstructor1();
		ParameterizedConstructor1 obj2 = new ParameterizedConstructor1(100);
		System.out.println("var is: " + obj.getValue1());
		System.out.println("var is: " + obj2.getValue1());

	}

}
