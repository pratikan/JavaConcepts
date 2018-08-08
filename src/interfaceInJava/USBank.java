package interfaceInJava;

//only method declaration
	// no method body -only method prototype
	// in interface we can declare the variables,variable are by default static
	// in nature
	// vars value cannot be changed
	// no static method in interface
	// no main method in interface
	// we can not create the object of interface
	// interface are abstract in nature
public interface USBank {
	
	int min_bal = 100;// variable value can not be changed,its final and
						// constant in nature

	public void credit();

	public void debit();

	public void transferMoney();

	

}
