package StringConcepts;

public class StringBuilderConcepts {

	public static void main(String[] args) {
		//append()
		StringBuilder sb= new StringBuilder("Hello");
		sb.append("World");
		System.out.println(sb);
//insert()
		StringBuilder st= new StringBuilder("Helloorld");
		st.insert(5, "W");
		System.out.println(st);
		//replace()
		StringBuilder s2 = new StringBuilder("HelloWorld");
		s2.replace(5, 10, "Earth");
		System.out.println(s2);
		
	   //delete()
		StringBuilder s3 = new StringBuilder("user123@gmail.com");
		s3.delete(8, 17);
		System.out.println(s3);
		//reverse()
		StringBuilder s4 = new StringBuilder("lived");
		s4.reverse();
		System.out.println(s4);
		
		//Capacity()
		StringBuilder s5 = new StringBuilder();
		s5.capacity();
		System.out.println(s5.capacity());//default value 16 
		

		
	}

}
