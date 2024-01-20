package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		
		Student s1 = new Student("Tom",50);
		Student s2 = new Student("Kiran",40);
		Student s3 = new Student("Harry",80);
      
		ArrayList<Student> a = new ArrayList<Student>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		
		Collections.sort(a);
		
		Iterator<Student> i =a.iterator();
	       while(i.hasNext())
	         {
	    	   System.out.println(i.next());
	       }
		}
		
  }


