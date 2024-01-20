package com;

import java.util.ArrayList;

public class StringObject {

	public static void main(String[] args) {
		ArrayList<Object> l = new ArrayList<Object>();
		l.add(10);
		l.add(1.5);
		l.add("Hello");
		l.add(30);
		l.add("Hii");
		
		for(Object obj: l) {
			if(obj instanceof String) {
				String i =(String)obj;
				if(i.startsWith("H")) {
			System.out.println(i);
		}

	}
  }
 }
}

 