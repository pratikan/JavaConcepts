package StringConcepts;

public class StringConcat {

	public static void main(String[] args) {
		String s= new String("selenium");
		
		s.concat("selenium class");
		System.out.println(s);
		//covert the given string to uppercase 
		String str = s.toUpperCase();
		System.out.println(str);
		//covert the given string to lowercase
		String st = s.toLowerCase();
		System.out.println(st);
	}

}
