package interfaceInJava;

public class HSBCBank implements USBank, BrazilBank {// we are achieving  multiple inheritance
	// IS-A relationship
	// if a class is implementing any interface ,
	// the its mandatory to define/override all the methods of interface

	// overriding from USBank
	public void credit() {
		System.out.println("hsbc---credit");

	}

	public void debit() {
		System.out.println("hsbc---debit");

	}

	public void transferMoney() {
		System.out.println("hsbc----transferMethod");

	}

	// Separate method of HSBCBank class
	public void educationLoan() {
		System.out.println("hsbc --edu--loan");
	}

	public void carLoan() {
		System.out.println("car---loan--method");
	}

	// brazil bank method--overriding from Brazil bank
	public void mutualfund() {
		System.out.println("hsbc--mutualfund");
	}

}
