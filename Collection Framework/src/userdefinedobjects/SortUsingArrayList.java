package userdefinedobjects;

import java.util.ArrayList;
import java.util.Collections;

public class SortUsingArrayList {
	public static void main(String[] args) {
		
		// We can use any List --> ArrayList,LinkedList,Vector & Stack
		 ArrayList<Student> a = new ArrayList<Student>();
	        a.add(new Student(78));
	        a.add(new Student(92));
	        a.add(new Student(56));
	    // Internally sort() calls or searches for compareTo()is Student Class    
	        Collections.sort(a);
	        for(Student b:a) {
	        	System.out.println(b);
	        }
	}

}
/**
 * In this program we are sorting objets using Comparable,List & Sort().
 * If Objects are not Comparable(if compareTo() is not present),
 * sort() gives Compilation Error.
*/