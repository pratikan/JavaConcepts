package com.javaOopsconcepts;

public class FunctionsInJava {
	
     //main method--starting point of execution
	public static void main(String[] args) {
		FunctionsInJava obj= new FunctionsInJava();
		//one object will be created,obj is object reference variable,referring to this object
        //after creating the object,the copy of all non static method will be given to this object
		obj.test();
		
		int l=obj.pqr();
		System.out.println(l);
		
		String s=obj.qa();
		System.out.println(s);
		
		int div =obj.division(30, 10);
		System.out.println(div);
//why main method is void?-->never returns a value
	//how to call static method
		//1-by direct calling
        sum();
        //2- by calling  by class name
        FunctionsInJava.sum();
	
	}
	//non-static mehtod
	//void-does not return any value
	//return type-void
	
	public void test(){
		System.out.println("test method");
	}
	//return type-int
	public int pqr(){ //no input some output
		System.out.println("pqr method");
		int a=10;
		int b=20;
		int c= a+b;
		return c;
	}
	//return type-string
	public String qa(){//no input some output
		System.out.println("qa method");
		String s ="selenium";
		return s;
	}
	//return type-int
	//x,y-->input parameter/arguments
	public int division(int x,int y){//
		System.out.println("division method");
		int d=x/y;
		return d;
	}
	public static int sum(){//static method
		System.out.println("sum method called");
		int p=20;
		int q=30;
		int r=p+q;
		return r;
	}
	
	
	
	
	}
	
	
	
	
	
	


