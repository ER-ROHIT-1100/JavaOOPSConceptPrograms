package mapexample;

public class Employee implements Comparable<Employee> {
	int id;
	
	 
	Employee(int id){
		this.id=id;
	
		
	}
	@Override
	public String toString() {
		return "Id: "+id+" Name:";
	}
	@Override
	public int compareTo(Employee e) {
		return this.id-e.id; //return e.id-this.id;
	}

}
