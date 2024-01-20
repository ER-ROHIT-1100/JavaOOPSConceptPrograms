package com;

class Student {

	public static void main(String[] args) {
		new Student(5.7);

	}
	 Student(int age){
		 this("Mallikarjun");
		 System.out.println("Age: "+age);
		 
	 }
     Student(String name){
    	
    	 System.out.println("Name: "+name);
    	 
     }
     Student(double height){
    	 this(22);
    	 System.out.println("Height: "+height);
     }
}
