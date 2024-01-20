package storingobjects;

public class Employee {

   String name;
   double salary;
   
   Employee(String name,double salary){
	   this.name=name;
       this.salary=salary;
	}
   public String toString() {
	   return "Salary of "+name+" is "+salary+"LPA";
   }

}
