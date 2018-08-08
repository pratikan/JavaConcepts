package com.javaOopsconcepts;

public class MethodOverloadingInJava {

	public static void main(String[] args) {

		MethodOverloadingInJava obj = new MethodOverloadingInJava();
		obj.test();
		
		int s = obj.sum();
		System.out.println(s);
		
		String str =obj.PQR();
		System.out.println(str);

	}

	public void test() {// 0 parameter
		System.out.println("test method");
	}

	public void test(int i) {// 1 parameter
		System.out.println("test method");
	}

	public void test(int i, int j) {// 2 parameter
		System.out.println("test method");
	}

	public void test(String i, String j) {// 2 parameter
		System.out.println("test method");
	}

	// method overloading:-when in the same class ,functions are having same
	// name
	// with different parameter
	public int sum() {
		System.out.println("sum method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}
	public String PQR(){
		System.out.println("PQR method");
		String s="selenium";
		return s;
	}

}
