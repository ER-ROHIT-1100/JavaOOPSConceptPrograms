package customexception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 6000;
		System.out.println("Enter the Balance: ");
		int amount =sc.nextInt();
		
		if(amount < balance) {
			System.out.println("Amount withdrawn Successful");
		}
		else{
			try {
			throw  new InsufficientBalanceException("Invalid Balance");
			}
			catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	  }
   }
}
