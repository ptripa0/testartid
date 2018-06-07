package testartid;

public class CheckingAccount {
	protected double balance;
	private int acno; 
	
	
	public CheckingAccount(int acno) {
		this.acno=acno;
		System.out.println("Your account no is "+acno);
	}
	
	public double getBalance(double balance) {		
		return balance;
	}
	

	public int getAcno(int acno) {
		return acno;
	}

	public void deposit(double amount) {
		
		balance=balance+amount;
	}
	
	public void withdraw(double amount) throws InsufficientFundException {
		
		if(amount <= balance) {
		balance=balance-amount;
		}
		else {
			double needs = amount - balance;
			throw new InsufficientFundException(needs);

		}
	}

}
