public class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private long dateCreated=System.currentTimeMillis();
	
	Account(){	
	}
	
	Account(int id, double balance){
		this.id=id;
		this.balance=balance;
	}
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return this.id=id;
	}
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return this.balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	public double getAnnualInterestRate(){
		return this.annualInterestRate;
	}
	
	public long getDateCreated(){
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return this.annualInterestRate/12;
	}
	
	public double getMonthlyInterest(){
		return this.balance*getMonthlyInterestRate();
	}
	
	public void withdraw(double amount){
		this.balance-=amount;
	}
	
	public void deposit(double amount){
		this.balance+=amount;
	}
	
	
}