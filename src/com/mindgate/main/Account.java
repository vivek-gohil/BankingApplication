package com.mindgate.main;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		} else
			return false;
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount < balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

}
