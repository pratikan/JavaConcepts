package constructorproject;

public class StaticConstructorNotPossible {
	//static Constructor not possible in java.it will give you error 
	//"modifier static not allowed here"
	public  StaticConstructorNotPossible(){
		System.out.println("Static constructor not possible in Java");
	}

	public static void main(String[] args) {
		
		StaticConstructorNotPossible st= new StaticConstructorNotPossible();

	}

}
