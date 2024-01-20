package org;

public class Employee {
	 int age;

	Employee(int age){
		this.age=age;  
		}
	   @Override 
	   public boolean equals (Object obj) { // Object obj = new Student(20);
		   Employee s = (Employee)obj;  // Downcasting
		   return this.age==s.age;  // s1.age ==s2.age;  -->20==20
		   
	   }
	public static void main(String[] args) {
		Employee s1 = new Employee(20);
		Employee s2=new Employee(20);
		System.out.println(s1.equals(s2)); // s1.equals(new Student(20));
	}
}
 // s1 --> this
 // s2 -->(upcasted reference) --> s(Downcasted reference)

