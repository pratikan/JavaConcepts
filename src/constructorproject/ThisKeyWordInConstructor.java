package constructorproject;

public class ThisKeyWordInConstructor {
//Class var or global var
	String name;
	int age;
	 public ThisKeyWordInConstructor(String name,int age){
		 this.name=name;
		 this.age=age;
		 
		 System.out.println(name);
		 System.out.println(age);
	 }
	
	
	
	public static void main(String[] args) {
		ThisKeyWordInConstructor obj = new ThisKeyWordInConstructor("tom",30);

	}

}
