package userdefinedobjects;

import java.util.Collections;
import java.util.TreeSet;

public class SortTreeSet {

	public static void main(String[] args) {
	TreeSet<Student> t = new TreeSet<Student>();
		t.add(new Student(78));
        t.add(new Student(92));
        t.add(new Student(56));
        
        for(Student s:t) {
        	System.out.println(s);
        }
       
	}
}
/**
 * In this program we are sorting objets using Comparable & TreeSet.
 * If Objects are not Comparable(if compareTo() is not present),
 * TreeSet throws ClassCastException
*/
