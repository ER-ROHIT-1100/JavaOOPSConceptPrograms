package rtp;

 class Emplyoee{
	 void work() {
		 System.out.println("Employee is Working:");
	 }
 }
  class Developer extends Emplyoee{
	  @Override
	  void work() { //-->Rule 1
		  System.out.println("Developing App");
	  }
  }
  class Tester extends Emplyoee{
	  @Override
	  void work() { //--> Rule 2
		  System.out.println("Testing App");
	  }
  }


public class Solution {
	 static void display(Emplyoee obj) {
		 obj.work();
	 }

	public static void main(String[] args) {
	  	Emplyoee e1 = new Developer();
	  	e1.work();
	  	 
		Emplyoee e2 = new Tester();
        e2.work();
        
        Emplyoee emp;
        emp=new Developer();
        emp.work();
        emp=new Tester();
        emp.work();
	
       display(new Developer());
       display(new Tester());
        
	}
}
