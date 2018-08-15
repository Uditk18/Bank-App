package com.app.bank.service;

import java.util.Collection;

import com.app.bank.dao.BankAccountCollection;
import com.app.bank.pojo.CurrentAccount;
import com.app.bank.pojo.SavingsAccount;

public class BankAccountService {
	private BankAccountCollection bankdao = new BankAccountCollection();

	public Collection<SavingsAccount> showSavings() {
		return bankdao.showSavings();
	}

	public Collection<CurrentAccount> showCurrent() {
		return bankdao.showCurrent();
	}
	public double withdraw(int d,double amount) {
		 return bankdao.withdraw(d, amount);
	}
	public double deposit(int accno,double depositAmount) {
		 return bankdao.deposit(accno, depositAmount);
	}
	public void transfer(int accno1,int accno2,int amount) {
		 bankdao.transfer(accno1,accno2,amount);
	}

}