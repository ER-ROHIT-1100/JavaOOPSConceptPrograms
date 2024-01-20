package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainRunner {

	public static void main(String[] args) {
		Employee e1 = new Employee("Kiran",2.5);
		Employee e2 = new Employee("Rohan",3.2);
		Employee e3 = new Employee("Mallikarjun",3.0);
		Employee e4 = new Employee("Rakshit",4.8);
		Employee e5 = new Employee("Kiran",3.5);
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		
		Collections.sort(l);
		
		System.out.println("Highest "+l.get(l.size()-1));
		
		System.out.println("--------");
		
		System.out.println("Lowest "+l.get(0));

//		Iterator<Employee> i =l.iterator();
//	       while(i.hasNext())
//	    	   {
//	    	   System.out.println(i.next());
//	       }
		System.out.println("-----------");
		for(Employee e:l) {
			if(e.salary>2.5&&e.salary<3.5)
			System.out.println(e);
		}
	 }     
		
	}


