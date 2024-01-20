package com;

class Teacher {	
	 int age;
	 String name;
	 Teacher(int age){
		 this.age=age;
	 }
     Teacher(int age,String name){
    	 this(age);// this.age = age; --> avoiding code redundancy
    	 this.name=name;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Teacher t= new Teacher(25,"Tom");
       System.out.println("Age:"+t.age+" Name:"+ t.name);
       
	}

}
