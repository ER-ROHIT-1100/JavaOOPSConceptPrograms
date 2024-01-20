package com;

    class EmployeeN {
       int id;
       String name;
       double salary;
       
       
      EmployeeN(int id){
    	  this.id=id;
     }
      EmployeeN(int id,String name){
    	  this(id);
    	 this.name= name;
      }
      EmployeeN(int id,String name,double salary){
         this(id,name);
         this.salary=salary;
      }
      public static void main(String[] args) {
		EmployeeN emp = new EmployeeN(101,"Satish",18.5);
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.salary);
	}
	
}