package defaultsorting;

public class Employee implements Comparable<Employee> {
     Double salary; // wrapper class Declaration to call compareTo() later.
     String name;
	/**
	 * @param salary
	 * @param name
	 */
	 Employee(double salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Salary of "+name+" is "+salary+"LPA";
	}
//	@Override
//	public int compareTo(Employee e) {
//		return e.name.compareTo(this.name);
	@Override
	public int compareTo(Employee e) {
		return e.salary.compareTo(this.salary);
		
	}
}

