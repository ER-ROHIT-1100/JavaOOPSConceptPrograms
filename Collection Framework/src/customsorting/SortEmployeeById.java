package customsorting;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<Employee> {
	@Override
	public int compare(Employee x, Employee y) {
		return x.id-y.id; //Ascending // y.id-x.id;for Descending Order.
	}

}
// x.id ---> Current Object to be Inserted.
// y.id ---> Already Existing Object.
