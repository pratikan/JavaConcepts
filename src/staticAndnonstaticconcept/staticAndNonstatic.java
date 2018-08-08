package staticAndnonstaticconcept;

public class staticAndNonstatic {
	String name = "tom";// non static global variables
	static int age = 25;// static global variable

	public static void main(String args[]) {
		// how to call static method and variables
		// 1 direct calling
		sum();
		// 2 calling by classname
		staticAndNonstatic.sum();
		// how too call static variables
		System.out.println(age);
		System.out.println(staticAndNonstatic.age);

		// how to call non-static method and variables

		staticAndNonstatic obj = new staticAndNonstatic();
		obj.sendMail();
		System.out.println(obj.name);
		// can i access static method by using object reference?
		// yes
		obj.sum();// but one warning will be given

	}

	public void sendMail() {// non static method

		System.out.println("non static send mail method");
	}

	public static void sum() {// static method

		System.out.println("static sum method");
	}

}
