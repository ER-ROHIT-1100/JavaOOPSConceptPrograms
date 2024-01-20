package com;

class Employee {

	public static void main(String[] args) {
	
        new Employee(52.600);
	}
     Employee(int id){
    	 this("Karan",25);
    	 System.out.println("Id: "+id);
     }
     Employee(String name,int age){
    	  
    	 System.out.println("Name: "+name+" "+"Age: "+age);
     }
     Employee(double salary){
    	 this(101);
    	 System.out.println("Salary: "+salary);
     }
}
