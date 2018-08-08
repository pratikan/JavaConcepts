package constructorproject;
//What if you implement only parameterized constructor in class
//It will throw a compilation error because there is no Default constructor available
//DefaultConstructor1 obj = new DefaultConstructor1();

public class DefaultConstructor1 {

	private int var;

	public DefaultConstructor1(int num) {//parameterized constructor
		var = num;

	}

	public int getValue() {
		return var;

	}

	public static void main(String[] args) {
		//DefaultConstructor1 obj = new DefaultConstructor1();
		DefaultConstructor1 obj1 = new DefaultConstructor1(10);
		System.out.println("value of var is: " + obj1.getValue());

	}

}
