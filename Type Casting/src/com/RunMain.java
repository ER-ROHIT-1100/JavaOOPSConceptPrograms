package com;

 class Student{
	 String name;
	 int marks;
	 
	 Student(String name,int marks){
		 this.name = name;
		 this.marks= marks;
	 }
 }


class RunMain {
	
	static void checkHighestMarks(Student s1, Student s2) {
		if(s2.marks>s1.marks) {
			System.out.println(s2.name+" with highest"+s2.marks);
		}
		else
			System.out.println(s1.name+" with highest"+s1.marks);
		 	
		
	}

	public static void main(String[] args) {
     Student s1 = new Student("Tom",58);
     Student s2 = new Student("Jerry",78);
     checkHighestMarks(s1,s2);

	}

}
