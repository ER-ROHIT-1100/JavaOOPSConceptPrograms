package org;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(10);
		v.add(1.5);
		v.add(30);
		v.add(false);
		v.add("Java");
		
		for(Object obj : v) {
			System.out.println(obj);
		}

	}

}
