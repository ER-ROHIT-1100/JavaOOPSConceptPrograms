package com;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Jspider j = new Jspider();
		Scanner scan = new Scanner(System.in);
	    System.out.println("Menu");
	    System.out.println("-----");
	    System.out.println("1:Tom\n2:Jack\nEnter Choice:");
	    int choice = scan.nextInt();
	    scan.close();
	    Student s = j.display(choice);
	 if(s instanceof Tom ) {
		  System.out.println("Studying Java");
	  }
	  else if(s instanceof Jack) {
		  System.out.println("Studying Python");
	  }else
	  {
	  System.out.println("Invalid Choice");
	}
}
}