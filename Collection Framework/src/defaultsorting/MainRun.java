package defaultsorting;

import java.util.TreeSet;

public class MainRun {

	public static void main(String[] args) {
		Employee e1 = new Employee(3.3,"Jack");
		Employee e2 = new Employee(3.1,"Smith");
		Employee e3 = new Employee(3.5,"Tom");
		
		TreeSet<Employee> t = new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		for(Employee e: t) {
			System.out.println(e);
		}
	}

}
