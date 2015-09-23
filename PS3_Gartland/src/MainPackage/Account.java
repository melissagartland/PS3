package MainPackage;
import java.util.Date;

public class Account {
	private int accountNumber;
	private double balance;
	private double annualInterest; 
	private java.util.Date accountDate;
	
	public Account(int i) { //no arg constructor
	}
	
	public Account(int accountNumber, double balance, double annualInterest, Date accountDate) {
		this.setAccountNumber(accountNumber);
		this.balance = balance;
		this.annualInterest = annualInterest;
		this.accountDate = new java.util.Date();
	}
	
	public Date getDate(){
		accountDate = new java.util.Date(06/27/2011);
		return accountDate;
	}
	public void deposit(double amount){
		amount += balance; 
	}
	public double getMonthlyInterest(double monthlyRate){
		monthlyRate = annualInterest/12;
		return monthlyRate;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException{
		if ( amount <= balance){
			balance -= amount;
		}
		else{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
			
		
	}
	public double getBalance(){
		return balance;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
