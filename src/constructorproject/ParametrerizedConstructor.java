package constructorproject;

public class ParametrerizedConstructor {
	   int empId;  
	   String empName; 
	   
	   ParametrerizedConstructor( int empId ,String empName){//parameterized constructor with two parameters 
		   this.empId = empId;
		   this.empName= empName;
	   }
	   void info(){
		   System.out.println("Id: "+empId+" Name: "+empName);
		   
	   }
	
	public static void main(String[] args) {
		ParametrerizedConstructor pr = new ParametrerizedConstructor(463434,"Naveen");
		ParametrerizedConstructor pr1 = new ParametrerizedConstructor(233444, "Pratik");
		pr.info();
		pr.info();
	}

}
