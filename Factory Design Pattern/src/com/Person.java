package com;

import java.util.Scanner;

public class Person {
	public static BookingCab selectCab(int choice) {
		BookingCab b = null;
		if(choice==1) {
		 b=new Ola();
		}else if(choice ==2) {
			b=new Uber();	
		}else if(choice==3) {
			b= new Rapido();
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Menu");
	    System.out.println("-----");
	    System.out.println("1:Ola\n2:Uber\n3:Rapido\nEnter Choice:");
	    int choice = scan.nextInt();
	    scan.close();
	 BookingCab b =(BookingCab)selectCab(choice);
	 if(b instanceof Ola ) {
		  System.out.println("Booking Cab On Ola");
	  }
	  else if(b instanceof Uber) {
		  System.out.println("Booking Cab On Uber");
	  }
	  else if(b instanceof Rapido) {
		  System.out.println("Booking Cab On Rapido");
	  }
	  else {
		  System.out.println("Invalid Choice");
	  }
     
	}

}