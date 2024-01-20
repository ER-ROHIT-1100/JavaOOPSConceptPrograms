package defaultsorting;

public class Person implements Comparable<Person>{
   int age;
  String name;
   
   Person(int age,String name){
	   this.age=age;
	   this.name=name;
	   
   }
   @Override
   public String toString() {
	   return "Age : "+age+" Name: "+name;
   }
   @Override
   public int compareTo(Person p) {
		return this.name.compareTo(p.name);
   }
  }
/**
 * this  --> current object to be inserted
 * p -->already existing object
 *  
 * 1. sorting based on age(int)
 *  Ascending Order --> return this.age - p.age;
 *  Descending Order --> return p.age - this.age;
 * 
 * 2. sorting based on name(String)
 *  Ascending Order --> return this.name.compareTo(p.name);
 *  Descending Order --> return p.name.compareTo(this.name);
 *  
 *  -for String comparison,we cannot use(-), we should use compareTo()
 *  of String class.  
 */


