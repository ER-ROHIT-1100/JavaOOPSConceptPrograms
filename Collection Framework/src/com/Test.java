package com;
import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
	
	// Internally an array gets created of default initial Capacity(10)
		ArrayList a = new ArrayList();
		
	// Internally an array gets created of default initial Capacity(20)	
		ArrayList b = new ArrayList();

		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);
		
	// Adding 1 Collection into another Collection
		ArrayList y = new ArrayList(x);
		y.add(30);
		
		System.out.println(x);  //  [10, 20]
		System.out.println(y);  //  [10, 20, 30]

	}

}
