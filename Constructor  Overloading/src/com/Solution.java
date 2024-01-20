package com;

class Solution {

	public static void main(String[] args) {
	 Person p1 = new Person(21);
	 Person p2 = new Person(5.6);
	 Person p3 = new Person(25,"Nilesh");
	 Person p4 = new Person("Vishnu",23);
 
	}
	

}
   class Person{
	 int  age;
	 String name;
	 double ht; 
 
   Person(int age){
	 this.age=age;	
	 System.out.println("Age: "+age);
	 }
    Person(double ht) {
	  this.ht=ht;
	 System.out.println("Height: "+ht);
     }  
      Person(int age,String name) {
    	 this.age=age;
    	 this.name=name;
    	 System.out.println("Age: "+age+" "+"Name: "+name);
     }
      Person(String name,int age){
    	  this.name=name;
    	  this.age=age;
    	  System.out.println("Nmae: "+name+" "+"Age: "+age);
      }
   }  
   