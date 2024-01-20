package com;

import java.util.Scanner;

public class MainSolution {

	public static void main(String[] args) {
		User u = new User();
		Scanner scan = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("-----");
		System.out.println("1:Flipkart\n2:Myntra\nEnter Choice:");
		int choice = scan.nextInt();
		scan.close();
		OnlineShoppingApp o = u.selectApp(choice);
		if(o instanceof Flipkart ) {
			System.out.println("Ordering From Flipkart");
		}
		else if(o instanceof Myntra) {
			System.out.println("Ordering From Myntra");
		}else
		{
			System.out.println("Invalid Choice");
		}
	}
}
