package com.app.bank.pojo;



public  class BankAccount {
	private int accountNo;
	private Customer accountHolder;
	private double accountBalance;

	public BankAccount(int accountNo, Customer accountHolder, double accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public void setAccountHolder(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Customer getAccountHolder() {
		return accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
}