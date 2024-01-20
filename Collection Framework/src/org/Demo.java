package org;

import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
        l.add(10);
        l.add(1.5);
        l.add('r');
        l.add(true);
        
        for(int i=0; i<l.size(); i++) {
        	System.out.println(l.get(i));
        }
       System.out.println("-----");
	for(int i=l.size()-1; i>=0; i--) {
		System.out.println(l.get(i));
   }
}
}