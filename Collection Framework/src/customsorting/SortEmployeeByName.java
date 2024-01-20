package customsorting;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator<Employee> {
	@Override
	public int compare(Employee x, Employee y) {
		return x.name.compareTo(y.name);
	}

}
// x.name ---> Current Object to be Inserted.
// compareTo() --> Used to compare with String class.
// y.name ---> Already Existing Object.
