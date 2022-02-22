package assignment9;

//import org.system.Bankinfo;

public class Bank extends SBI implements CIBIL,PNB {

	public void maximumLoanamount() {
		System.out.println("maxmium loan amount is 12345");
		
	}

	public void creditScore() {
		System.out.println("credit score is 8.5");
		
	}

	public void minimumBalance() {
		System.out.println("minimum balance is 5000");
		
	}

	public void cibilScore() {
		System.out.println("cibil score is 9");
		
	}

	@Override
	public void bankBalance() {
		System.out.println("bank balance is 12344");
		
	}

	@Override
	public void maximumLoan() {
		System.out.println("maximum loan amount is 123455");
		
	}
	public static void main(String[] args) {
		Bank get=new Bank();
		get.cibilScore();
		get.bankBalance();
		get.maximumLoanamount();
		get.minimumBalance();
		get.minimumBalance();
		get.itLOAN();
		
	}

}
