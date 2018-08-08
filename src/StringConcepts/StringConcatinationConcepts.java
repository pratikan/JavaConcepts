package StringConcepts;

//+: is Concatenation operator
//println: is used to print on the console with a new line
//print: is just used to print on the console

public class StringConcatinationConcepts {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="World";
		 
		double d=21.33;
		double e=12.34;
		System.out.println(a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println((x+y)+a+b);
		System.out.println(x+y+a+b+y+a+x);
		System.out.println(d+e);
		System.out.println(a+b+d+e);
		System.out.println(a);
		System.out.println("the value of a is: " +a);
		
		System.out.println("the value of a and b is: "+(a+b));

	}

}
