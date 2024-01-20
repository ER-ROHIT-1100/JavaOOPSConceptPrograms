package com;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
	  ArrayList x = new ArrayList();
	  x.add(10);
	  x.add(20);
	  x.add(10);
	  x.add(10);
	  x.add(30);
	  
	  System.out.println(x);
	  System.out.println(x.indexOf(10));
	  System.out.println(x.lastIndexOf(10));
	
	  System.out.println("===========");
	  
	  ArrayList l = new ArrayList();
	   
	  l.add(12);
	  l.add(25);
	  l.add(37);
	 
	  System.out.println(l);
	  l.add(1,55);
	  System.out.println(l);
	  l.set(2, 77);
	  System.out.println(l);
	}

}
