package customsorting;

import java.util.Comparator;

public class SortBeerByCost implements Comparator<Beer> {
	@Override
	public int compare(Beer x,Beer y) {
		int i = x.getCost();
		int j = y.getCost();

		return i-j;

		//return x.getCost()-(y.getCost());

	}
}
// x --> current object to be inserted & y --> already existing object.
// return y.getCost()-(x.getCost());