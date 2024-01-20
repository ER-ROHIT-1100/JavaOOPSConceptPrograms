package com;

//Accessing public members in Same class
   public class Student {
     public static int id=101; // ststic variable
     public int age=22;  // non-static variable
     
       public Student() {
    	   System.out.println("Name:Mallikarjun");
       }
      
     public void study() { //non-ststic method
    	 System.out.println("Studyinf Java");
     }
     public static void main(String[] args) {
		System.out.println("Id: "+id); // Student.id
		
		 Student s = new Student();
		 System.out.println("Age: "+s.age);
		 s.study();
	}
}
