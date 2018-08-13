package com.app.bank.pojo;

public class CurrentAccount extends BankAccount {
	private double odLimit;

	
	public CurrentAccount(int accountNumber,Customer accountHolder, double accountBalance, double odLimit) {
		super(accountNumber,accountHolder, accountBalance);
		this.odLimit=odLimit;
		// TODO Auto-generated constructor stub
	}

	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [odLimit=" + odLimit + ", toString()=" + super.toString() + "]";
	}	
}
