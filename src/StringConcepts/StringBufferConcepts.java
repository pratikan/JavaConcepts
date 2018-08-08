package StringConcepts;

public class StringBufferConcepts {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("GeeksforGeeks");
		//length() and capacity() method
		int p=sb.length();
		int q=sb.capacity();//initial capacity of String Buffer is=16
		System.out.println("Length of string GeeksforGeeks="+p);
		System.out.println("Capacity of String GeeksforGeeks="+q);
		
		StringBuffer s=new StringBuffer("Geeksfor");
		//append( ): It is used to add text at the end of the existence text.
		s.append("Geeks");
		System.out.println(s);//returns GeeksforGeeks
		s.append(1);
		System.out.println(s);//returns GeeksforGeeks1
		
		StringBuffer ss=new StringBuffer("GeeksGeeks");
		//insert( ): It is used to insert text at the specified index position
		ss.insert(5, "for");
		System.out.println(ss);//returns GeeksforGeeks
		ss.insert(0, 5);//returns 5GeeksforGeeks
		System.out.println(ss);
		ss.insert(3, true);
		System.out.println(ss);//returns 5GetrueeksforGeeks
		ss.insert(5, 32.13f);
		System.out.println(ss);
		
		//reverse( ): It can reverse the characters within a StringBuffer object using reverse( )
		StringBuffer sf= new StringBuffer("GeeksGeeks");
		sf.reverse();
		System.out.println(sf);//return reverse skeeGskeeG
		
		//replace()=It can replace one set of characters with another set inside a StringBuffer object
		StringBuffer sff = new StringBuffer("GeeksforGeeks");
		sff.replace(5, 8, "are");
		System.out.println(sff);//replace for with are GeeksareGeeks
		
		

	}

}
