package customsorting;
import java.util.*;

public class Student{
     int age;
     int marks;
     
     Student(int age,int marks){
    	 this.age=age;
    	 this.marks=marks;
    	 
     }
	@Override
	public String toString() {
		return "Age: "+age+" Marks: "+marks;
	}
	
}
