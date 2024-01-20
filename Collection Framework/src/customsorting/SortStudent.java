package customsorting;

import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		Student s1 = new Student(21,78);
		Student s2 = new Student(23,65);
		Student s3 = new Student(18,54);
		
		SortStudentByAge a = new SortStudentByAge();
		SortSudentByMarks m = new SortSudentByMarks();
		
	   // TreeSet<Student> t = TreeSet<Student>(new SortStudentByAge());
	   // TreeSet<Student> t =  TreeSet<Student>(new SortSudentByMarks());
		
		// Sorting logic class or comparator class
		TreeSet<Student> t = new TreeSet<Student>(a);
		TreeSet<Student> k = new TreeSet<Student>(m);
		t.add(s1);  // internally calls compare() now
		t.add(s2);
		t.add(s3);
		
		k.add(s1);
		k.add(s2);
		k.add(s3);
		
		for(Student s:t) {
			System.out.println(s);
		}
			System.out.println("------");
			
			for(Student l:k)
		    System.out.println(l);
        }
	}


