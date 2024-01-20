package storingobjects;

import java.util.ArrayList;

public class StoringObjects {

	public static void main(String[] args) {
		Student s1 = new Student(21,"Tom");
		Student s2 = new Student(22,"Jerry");
		
		
	 ArrayList<Student> l = new 	ArrayList<Student>();
		l.add(s1); // l.add(new Student(21,"Tom"));
		l.add(s2); // l.add(new Student(22,"Jerry"));
             
	for(int i=0; i<l.size(); i++) {
		System.out.println(l.get(i));
	}
	for(Student s:l) {
		System.out.println(s);
	}
 }
}
