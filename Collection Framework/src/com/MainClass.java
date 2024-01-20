package com;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		
		ArrayList x = new ArrayList();
		x.addAll(l);
		x.add(30);
		
		System.out.println(x);
		System.out.println(x.containsAll(l));
		System.out.println("======");
		System.out.println(x);
		x.removeAll(l);
		System.out.println(x);
		
		
	}

}
