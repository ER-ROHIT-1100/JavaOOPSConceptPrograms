package userdefinedobjects;

import java.util.TreeSet;

public class SortByTreeSet {

	public static void main(String[] args) {
		// 
		TreeSet<Employee> t = new TreeSet<Employee>(new SortEmployeeById());
		t.add(new Employee(301,"Ram"));
		t.add(new Employee(101,"Sam"));
		t.add(new Employee(201,"Karan"));
		
		for(Employee e:t) {
			System.out.println(e);
		}
		System.out.println("==================");
		TreeSet<Employee> g = new TreeSet<Employee>(new SortEmployeeByName());
		g.add(new Employee(301,"Ram"));
		g.add(new Employee(101,"Sam"));
		g.add(new Employee(201,"Karan"));
		
		for(Employee h:g) {
			System.out.println(h);
		}
	}
}
