package storingobjects;

import java.util.LinkedList;

public class MainTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Vasi",4.8);
		Employee e2 = new Employee("Malli",6.5);
		Employee e3 = new Employee("Rakshit",5.6);
		
		LinkedList<Employee> l = new LinkedList<Employee>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
	for(Employee e: l) {
		System.out.println(e);
	}
		
	}	
}
