package com;

class MainRunner {

	public static void main(String[] args) {
		Atm a = new Atm();
		a.deposit(2000);
		a.withdraw(3000);
		a.checkBalance();
		
       System.out.println("-------");
       
		Bank b = new Atm();
		b.deposit(4000);
		b.withdraw(5000);
		b.checkBalance();

	}

}
