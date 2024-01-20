package com;
  
interface Jspiders{
	void develop();
}
interface Qspiders{
	void test();
	
}
 class Person{
	 void walk() {
		 System.out.println("Person Walking");
	 }
 }
 class Student extends Person implements Jspiders,Qspiders {
      
	      @Override
        public void develop() {
    	 System.out.println("Developing App");
       }
	      @Override
	     public void test() {
	    System.out.println("Developing App");
	}
	     public static void main(String[] args) {
	     Student std = new Student();
	      std.develop();
	      std.walk();
	      std.test();
	     
	}
}
