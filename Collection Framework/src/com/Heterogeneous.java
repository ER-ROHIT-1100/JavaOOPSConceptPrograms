package com;

import java.util.ArrayList;

public class Heterogeneous {

	public static void main(String[] args) {
		
		ArrayList<Object> l = new ArrayList<Object>();
		l.add(10);
		l.add(1.5);
		l.add(null);
		l.add(30);
		l.add(40);
		
		for(Object i: l) {
			if(i instanceof Integer) {
			System.out.println(i);
		}

	}
  }
}
