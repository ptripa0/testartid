package testartid;

public class BankDemo{
	int i=12;
			
	public void print() {
		System.out.println("in print method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println($n[0]);
		BankDemo bd = new BankDemo();
		bd.print();
		System.out.println(bd.i);
		//check account 
		//if balance is less call isufficientfund exception
		
		CheckingAccount chk = new CheckingAccount(54321);
		System.out.println("Deposit $500");
		chk.deposit(500);
		
		
		try {
				
			System.out.println("Widrawing $250");
			chk.withdraw(250);
			
			System.out.println("Widrawing $450");
			chk.withdraw(450);
		}
		catch(InsufficientFundException i){
			
			System.out.println("insufficient funds, shot by......"+i.getAmount());
			i.printStackTrace();
		}
		
		
	}

}
