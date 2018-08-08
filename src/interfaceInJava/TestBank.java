package interfaceInJava;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);

		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.carLoan();
		hs.mutualfund();
		hs.educationLoan();

		// dynamic polymorphism
		// Child class Can be referred by parents interface reference variable
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		

	}

}
