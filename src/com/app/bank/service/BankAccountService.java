package com.app.bank.service;

import java.util.Collection;

import com.app.bank.pojo.BankAccount;
import com.app.bank.pojo.CurrentAccount;
import com.app.bank.pojo.SavingsAccount;
import com.app.bank.dao.BankAccountCollection;

public class BankAccountService {
	private BankAccountCollection bankdao = new BankAccountCollection();

	public Collection<SavingsAccount> showSavings() {
		return bankdao.showSavings();
	}

	public Collection<CurrentAccount> showCurrent() {
		return bankdao.showCurrent();
	}
	public BankAccount withdraw(int d,double amount) {
		 return bankdao.withdraw(d, amount);
	}
	public void deposit(int accno,int amount) {
		 bankdao.deposit(accno, amount);
	}
	public void transfer(int accno1,int accno2,int amount) {
		 bankdao.transfer(accno1,accno2,amount);
	}

}