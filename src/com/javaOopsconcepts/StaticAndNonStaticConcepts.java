package com.javaOopsconcepts;

public class StaticAndNonStaticConcepts {
	//global vars:-the scope of global vars will be available across all 
	//the functions with some conditions.
	
	String name="tom";//non-static global vars
	static int age=25;//static global vars

	public static void main(String[] args) {
		//how to call static method and variables
		//1 direct calling
		sum();
		//2-by calling by class name
		StaticAndNonStaticConcepts.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcepts.age);
	//how to call non-static method and vars
		StaticAndNonStaticConcepts obj = new StaticAndNonStaticConcepts();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can i access static methods by using object reference? yes
		obj.sum();//warning will be given 

	}
	public void sendMail(){//non-static mehtod
		System.out.println("non-static send mail method");
		
	}
	public static void sum(){//static method
		System.out.println("static sum mehtod called");
	}
	
	
	

}
