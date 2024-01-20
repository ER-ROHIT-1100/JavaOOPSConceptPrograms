package com;

class Employee{
	int id = 100;
	String name ="Tom";
}
class Devloper extends Employee{
	void developApp() {
		System.out.println("Developing App");
	}
}
class Tester extends Employee{
	void testApp() {
		System.out.println("Testing App");
	}
}
class Solution {

        static void display(Employee obj) {
        	if(obj instanceof Devloper) {
        	Devloper d = (Devloper) obj;
        		System.out.println(d.id+" "+d.name);
        		d.developApp();
        	}
        	else if(obj instanceof Tester) {
        		Tester t =(Tester)obj;
        		System.out.println(t.id+" "+t.name);
        		t.testApp();
        	}
        }


	public static void main(String[] args) {
         display(new Devloper());
         
         System.out.println("----");
         
         display(new Tester());
	}

}
