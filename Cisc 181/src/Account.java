import java.util.Date;
import java.io.*;
public class Account {
	//THe Data fields
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private double dateCreated;
	private  double dateCreated(){
		this.dateCreated = 9-23-2015;
		return dateCreated;
	}
	public double MonthlyInterestRate;	
	public double deposit;
	
	//Constructor
	public Account(int id, double balance, double annualInterestRate ){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	//accesor and mutators for each variable
	public int getid(){
		return id;
	}
	public int setid(int id ){
		return this.id = id;
	}
	public double getbalance(){
		return MonthlyInterestRate;
	}
	public void setbalance(double balance){
		this.balance = balance;
	}
	public void getannualInterestRate(){}
	public double setannualInterestRate(double annualInterestRate){
		return this.annualInterestRate = annualInterestRate/100;
	}
	
	
	public double getMonthlyInterestRate(double MonthlyInterestRate){
		this.MonthlyInterestRate = MonthlyInterestRate;
		return MonthlyInterestRate;
	}
	public double withdraw(double withdraw){
		balance  -= withdraw;
		if(balance < 0){
			class InsufficientFundsException extends Exception{
				private double amount;
			   /**
			    * Create an instance of the InsufficientFundsException class, to be thrown to the caller
			    * @param amount
			    */
			   public InsufficientFundsException(double amount)
			   {
			      this.amount = amount;
			   } 
			   public double getAmount()
			   {
			      return amount;
			   }
			}}
		return withdraw;
		
		}
	public double deposit(double deposit){
		balance  += deposit;
		return balance;
	}
}

