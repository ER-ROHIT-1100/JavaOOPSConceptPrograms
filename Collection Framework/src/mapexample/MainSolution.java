package mapexample;

import java.util.LinkedHashMap;
import java.util.Set;

public class MainSolution {

	public static void main(String[] args) {
      Student s1 = new Student(25,"Arun");
      Student s2 = new Student(23,"Karan");
      Student s3 = new Student(26,"Jivan");
      
      LinkedHashMap<Student,Integer> map = new  LinkedHashMap<Student,Integer>();
      map.put(s1, 100);  // map.put(new Student(21,"Tom"),45);
      map.put(s2, 200);  // map.put(new Student(22,"Jerry"),48);
      map.put(s3,300);   // map.put(new Student(23,"Alex"),43);
      
      Set<Student> key = map.keySet();
      for(Student i:key) {
    	  System.out.println(i+" "+map.get(i));
      }
      
  }

}
