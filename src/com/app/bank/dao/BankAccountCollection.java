package com.app.bank.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.app.bank.pojo.BankAccount;
import com.app.bank.pojo.CurrentAccount;
import com.app.bank.pojo.Customer;
import com.app.bank.pojo.SavingsAccount;

public class BankAccountCollection {

	Map<Integer, SavingsAccount> savDB = new HashMap<>();
	Map<Integer, CurrentAccount> curDB = new HashMap<>();

	public Collection<SavingsAccount> showSavings() {
		savDB.put(1001, new SavingsAccount(1001,
				new Customer("Alok", "7985254250", "alokrai697@gmail.com", "02/07/1997"), 10000, true));
		savDB.put(1002, new SavingsAccount(1002, new Customer("Udit", "8525425022", "uditk18@gmail.com", "09/07/1996"),
				2000, true));
		savDB.put(1003, new SavingsAccount(1003,
				new Customer("Mayur", "8545201232", "mayurkiyaan8@gmail.com", "15/07/1995"), 1500, false));
		return savDB.values();

	}

	public Collection<CurrentAccount> showCurrent() {
		curDB.put(5001, new CurrentAccount(5001,
				new Customer("Alok", "7985254250", "alokrai697@gmail.com", "02/07/1997"), 15000, 10000));
		curDB.put(5002, new CurrentAccount(5002,
				new Customer("Shivam", "8457568585", "shivam007@gmail.com", "11/08/1996"), 12000, 10000));
		return curDB.values();

	}

	public BankAccount withdraw(int accountNumber, double amount) {

		if (savDB.get(accountNumber).getAccountBalance() > amount) {
			savDB.get(accountNumber).setAccountBalance(savDB.get(accountNumber).getAccountBalance() - amount);

			return savDB.get(accountNumber);
		}

		else
			return null;
	}

	public void deposit(int accountNumber, double amount) {
		Integer i = accountNumber;
		if (savDB.get(i) != null) {
			savDB.get(i).setAccountBalance(savDB.get(i).getAccountBalance() + amount);
		} else {
			System.out.println("Error");
		}
	}

	public void transfer(int accountNumber1, int accountNumber2, double amount) {
		Integer i = accountNumber1;
		Integer j = accountNumber2;

		if (savDB.get(i) != null) {
			savDB.get(i).setAccountBalance(savDB.get(i).getAccountBalance() - amount);
		} else {
			System.out.println("Error");
		}
		if (savDB.get(j) != null) {
			savDB.get(j).setAccountBalance(savDB.get(j).getAccountBalance() + amount);
		} else {
			System.out.println("Error");
		}
	}

}