package customsorting;

public class Employee {
   int id;
   String name;
   
   Employee(int id,String name){
	   this.id=id;
	   this.name=name;
   }
   @Override
   public String toString() {
	   return "EMP Id of "+name+" is "+id;
   }
}
