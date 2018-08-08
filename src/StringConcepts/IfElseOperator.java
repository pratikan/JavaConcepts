package StringConcepts;

public class IfElseOperator {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		
		if(b>a){
			System.out.println("b is greater then a");
		}
		else{
			System.out.println("a is greater then b");
		}
		//Comparison operator
		//<,> <= => == !=
		int c= 50 ;
		int d= 40;
		
		if(c==d){
			System.out.println("c and d are equal");
			}
		else{
			System.out.println("c and d are not equal");
		}
		//write a logic to find out highest number
		int a1= 100;
		int b1=200;
		int c1=400;
		//nested if-else
		if(a1>b1 & a1>c1){
			System.out.println("a is greater");
		}
		else if (b1>c1){
			System.out.println("b1 is greater");
		}
		else{
			System.out.println("c1 is greater");
		}
			
		}

	}


