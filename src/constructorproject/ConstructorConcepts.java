package constructorproject;

public class ConstructorConcepts {

	public ConstructorConcepts() {//
		System.out.println("default ----constructor");
	}

	public ConstructorConcepts(int i) {//
		System.out.println("1 para----constructor");
		System.out.println("the value of i " + i);
	}

	public ConstructorConcepts(int i, int j) {
		System.out.println("1 para----constructor");
		System.out.println("the value of i " + i);
		System.out.println("the value of j " + j);
	}

	public static void main(String[] args) {
		ConstructorConcepts obj = new ConstructorConcepts();
		ConstructorConcepts obj1 = new ConstructorConcepts(20);
		ConstructorConcepts obj2 = new ConstructorConcepts(30, 40);

	}

}
