package org;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		     l.add(20);
	         l.add(10);
	         l.add(40);
	         l.add(30);
	    // Insertion Order is Maintained     
	      System.out.println(l);
	     
	    // Sorting in Ascending Order 
	      Collections.sort(l);
	      System.out.println(l);
	       
	   // Reversing the sorted Order
	      Collections.reverse(l);
	      System.out.println(l);
	         
         }
     }
