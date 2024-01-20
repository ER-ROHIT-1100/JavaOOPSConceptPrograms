package com;

import java.util.Scanner;

public class Customer {
	
	static FoodDeliveryApp selectApp(int choice) {
		if(choice == 1) {
			return new Swiggy();
   	}else if(choice == 2) {
   		return new Zomato();
   	}else
   		return null;
  }

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Menu");
    System.out.println("-----");
    System.out.println("1:Swiggy\n2:Zomato\nEnter Choice:");
    int choice = scan.nextInt();
    scan.close();
    
    FoodDeliveryApp obj=Customer.selectApp(choice);
    if(obj!=null) {
    	System.out.println(obj);
    }else
    System.out.println("Invalid Choice");
}
}