package org;

    class Student {
   int age;
   
   Student(int age){
	   this.age=age;
	   }
   public static void main(String[] args) {
	Student s1 = new Student(20);
	Student s2 = new Student(20);
	System.out.println(s1.equals(s2));
}
}
