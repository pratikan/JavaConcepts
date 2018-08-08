package com.javaOopsconcepts;

public class LocalVsGlobalVariables {
	//global variables--->calss variables
	String name= "tom";
	int age=25;

	public static void main(String[] args) {
		
		int i=10;//local variables for main method
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
       System.out.println(obj.name);
       System.out.println(obj.age);
      
	}
	public void sum(){
		int i=15;//local variables for sum method
		int j=20;
	}

}
