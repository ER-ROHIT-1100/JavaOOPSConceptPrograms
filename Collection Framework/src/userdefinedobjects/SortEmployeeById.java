package userdefinedobjects;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<Employee> {
	@Override
	public int compare(Employee x,Employee y) {
		return x.id-y.id; // Desc --> return y.id - x.id;
	}
}
