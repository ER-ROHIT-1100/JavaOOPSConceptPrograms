package com;

import java.util.Scanner;

public class Amazon {
	
	static Gadgets order(int choice) {
		if(choice == 1) {
			Gadgets l = new Laptop(); // return Laptop();
			return l;
		}
		else if(choice == 2 ){
			Gadgets m = new Mobile(); // return Mobile();
			return m;
		}
		else if(choice == 3) {
			Gadgets w = new Watch(); // return Watch();
			return w;
		}
		else{
			return null;
		}
	}
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	      System.out.println("Menu");
	      System.out.println("-----");
	      System.out.println("1:Laptop\n2:Mobile\n3:Watch\nEnter Choice:");
	      int choice = scan.nextInt();
	      scan.close();
	      
	      Gadgets obj = Amazon.order(choice);
//	      if(obj instanceof Laptop) {
//			  System.out.println("Ordered Laptop");
//		  }
//		  else if(obj instanceof Mobile) {
//			  System.out.println("Ordered Mobile");
//		  }
//		  else if(obj instanceof Watch) {
//			  System.out.println("Ordered Watch");
//		  }
//		  else {
//			  System.out.println("Invalid Choice");
//		  }
	      if(obj!=null) {
	    	  System.out.println(obj);
	      }
	      else {
	    	  System.out.println("Invalid Choice");
	      }
	}
	
}