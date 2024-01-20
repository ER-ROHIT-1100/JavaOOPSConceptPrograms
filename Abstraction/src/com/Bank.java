package com;

public interface Bank {
	void deposit(int amount);
	void withdraw(int amount);
	void checkBalance();
}
    //All method inside interface are public and abstract
     class Atm implements Bank{
    	 int balance =5000;
    	 @Override
    	public  void deposit(int amount) {
    		 System.out.println("Depositing Rs: "+amount);
    		 balance =balance + amount;
    		 System.out.println("Amount Deposited Successfully!");
    		 System.out.println("Amount Balance: "+balance);
    	 }
    	 @Override
    	 public void withdraw(int amount) {
    		 System.out.println("Withdraw Rs: "+amount);
    		 balance = balance- amount;
    		 System.out.println("Amount Withdrawn Successfully!");
    		 System.out.println("Amount Balance: "+balance);
    	 }
    	 public void checkBalance() {
    		 System.out.println("Account Balance "+balance);
    	 }
     }











