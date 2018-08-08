package WrapperClassInJava;

public class WrapperClassConcepts {

	public static void main(String[] args) {
		//String concatenation 
		String x = "100";
		System.out.println(x + 200);
		//Data conversion :String to Int
		int i = Integer.parseInt(x);
		System.out.println(i + 20);
		
		//we have different type of Wrapper class
		//Integer,Double,Character,Boolean
    //String to double conversion
		String s="22.33";
		double d=Double.parseDouble(s);
		System.out.println(d+100);
		
		//String to boolean:
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to String conversion
		int j=100;
		System.out.println(j+20);
		String s1=String.valueOf(j);
		System.out.println(s1+20);
		
		String u="100A";
		Integer.parseInt(u);
		
		
	}

}
