package StringConcepts;

public class StringManipulationConcepts {

	public static void main(String[] args) {
		String str="india is great country always";
		String str1="india is Great country always";
		
		System.out.println(str.length());//get the length of a string
		
		System.out.println(str.charAt(7));// s is on 5th position count starting from 0
		
		System.out.println(str.indexOf("a"));//a position is 4th
      System.out.println(str.indexOf("a", str.indexOf("a")+1));//2nd occurrence of a
      System.out.println(str.indexOf("a", str.indexOf("a", str.indexOf("a")+1)+1));//3rd occurrence of a
      System.out.println(str.indexOf("a", str.indexOf("a", str.indexOf("a", str.indexOf("a")+1)+1)+1));
      //4th occurrence of a
      //check the index of specific string
      System.out.println(str.indexOf("great"));
      
      System.out.println(str.lastIndexOf("always"));
      System.out.println(str.indexOf("is"));
      
      System.out.println(str.indexOf("hello"));//Hello not present in string so output -1
      
    //String comparison
      System.out.println(str.equals(str1));//false because G is capital
      System.out.println(str.equalsIgnoreCase(str1));//true here ignore capital 
      
      //substring
      System.out.println(str.substring(0, 12));
      
      //trim--returns the copy of the String,by removing whitespace at both ends.
      //it does not effect whitespace in the middle
      String s ="  Hello World  ";
      System.out.println(s.trim());
      System.out.println(s.replace(" ", ""));
      
      String date="05-11-1989";// if you want to replace with 05/11/1989
      System.out.println(date.replace("-", "/"));
      
    //Split
 	 String test="Hello_World_Test_Selenim";
 	 String testval[] = test.split("_");
 	 for(int i=0;i<testval.length; i++){
 		 System.out.println(testval[i]);
 	 }
 	 
 	//String concatenation means add or merge
 		 String s2="cares";
 		 System.out.println(s2.concat("s"));//caress o/p after concatenation
 		 
 		 String x="Hello";
 		 String y="World";
 		 int a=100;
 		 int b=200;
 		 System.out.println(x+y+a+b);
 		 System.out.println(x+y+(a+b));
 		 System.out.println(a+b+x+y);
 		 
      
	}

}
