package testartid;

public class InsufficientFundException extends Exception {
	public double amounts;
	
	public InsufficientFundException(double amounts) {
	this.amounts = amounts;
	}
	
	public double getAmount() {
		return amounts;
	}
	
}
