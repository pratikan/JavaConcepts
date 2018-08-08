package StringConcepts;

public class StringReverseConcepts {

	public static void main(String[] args) {
		//using for loop.
		String s=" India is Great";
		int len = s.length();
		String rev ="";
		for(int i=len-1;i>=0;i--){
			rev= rev + s.charAt(i);
		}
       System.out.println(rev);
       //using stringbuffer class
       StringBuffer sf= new StringBuffer(s);
       sf.reverse();
       System.out.println(sf);
       
	}

}
