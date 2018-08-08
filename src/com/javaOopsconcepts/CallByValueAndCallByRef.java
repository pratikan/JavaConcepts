package com.javaOopsconcepts;

public class CallByValueAndCallByRef {

	int p;
	int q;

	public static void main(String[] args) {
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x = 10;
		int y = 20;
		obj.testSum(x, y);// call by value or pass by value

		obj.p = 50;
		obj.q = 60;

		// after swapping the value is
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);

	}

	public int testSum(int a, int b) {// non-static method
		a = 30;
		b = 50;
		int c = a + b;
		return c;

	}

	public void swap(CallByValueAndCallByRef t) {
		int temp;
		temp = t.p;// 50
		t.p = t.q;// t.p=60
		t.q = temp;// t.q=50

	}

}
