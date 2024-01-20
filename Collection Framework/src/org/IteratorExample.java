package org;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		
		// 1. Iterator
     Iterator<Integer> i =l.iterator();
       while(i.hasNext())
         {
    	   System.out.println(i.next());
      }
       System.out.println("---------");
	// 2. For each loop
	   for(int k:l){	
		 System.out.println(k);	
		 }
	   System.out.println("---------");
	   // 3. for loop
	  for(int j=0; j<l.size();j++) {
		  System.out.println(l.get(j));
	  } 
  }
}