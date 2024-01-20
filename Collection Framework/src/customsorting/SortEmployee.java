package customsorting;

import java.util.TreeSet;

public class SortEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(100,"Tom");
		Employee e2 = new Employee(202,"Jack");
		Employee e3 = new Employee(303,"Rohan");

		//	SortEmployeeById i = new SortEmployeeById();
		//	SortEmployeeByName n = new SortEmployeeByName();

		// Sorting logic using compare().
		TreeSet<Employee> t = new TreeSet<Employee>(new SortEmployeeById());
		TreeSet<Employee> k = new TreeSet<Employee>(new SortEmployeeByName());
		t.add(e1);
		t.add(e2);
		t.add(e3);

		k.add(e1);
		k.add(e2);
		k.add(e3);

		for(Employee e:t) {
			System.out.println(e);
		}
		System.out.println("-------");

		for(Employee s:k) {
			System.out.println(s);
		}
	}
}
