package constructorproject;

public class Bike {
	
	public Bike(){// creating constructor syntax access modifiers class name  (default constructor)
		System.out.println("this is bike class constructor");
	}
	public Bike(int i){ // parameterize constructor
		
	}
	
	public void Start(){
		System.out.println("this is bike start fun");
	}
	

	public static void main(String[] args) {
		Bike bike=new Bike();//create an object
		bike.Start();//call the bike start function
	
		

	}

}
