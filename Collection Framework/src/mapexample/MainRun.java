package mapexample;

import java.util.Set;
import java.util.TreeMap;

public class MainRun {

	public static void main(String[] args) {
		
		TreeMap<Employee,String> map = new 	TreeMap<Employee,String>();
		map.put(new Employee(400),"Rahul");
		map.put(new Employee(200),"Karan");
		map.put(new Employee(500),"Ram");
		map.put(new Employee(300),"Arjun ");
		map.put(new Employee(100),"Sam");
		
		Set<Employee> key = map.keySet();
		for(Employee i:key) {
			System.out.println(i+" "+map.get(i));
		}
		
	}

}
