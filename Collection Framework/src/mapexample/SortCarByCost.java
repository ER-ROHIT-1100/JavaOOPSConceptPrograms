package mapexample;

import java.util.Comparator;

public class SortCarByCost implements Comparator<Car> {
	@Override
	public int compare(Car x,Car y) {
		return x.cost-y.cost;
	}

}
