package com;
    
  abstract class Employee{
	  abstract void work() ;
		 	  
  }
   class Tom extends Employee{
	   @Override
	   void work()
	   {
		   System.out.println("Tom is Working");
	   }
   }
class Solution {

	public static void main(String[] args) {
		Tom t = new Tom();
		t.work();

	}

}
