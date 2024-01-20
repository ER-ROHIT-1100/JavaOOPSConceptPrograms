package customsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class MainRunner {

	public static void main(String[] args) {

		Beer b1 = new Beer("Budwiser",300);
		Beer b2 = new Beer("Kingfisher",200);
		Beer b3 = new Beer("Tuborg",250);

		System.out.println("--Using TreeSet Sorting--");


		TreeSet<Beer> t = new TreeSet<Beer>(new SortBeerByBrand());
		t.add(b1);
		t.add(b2);
		t.add(b3);

		for(Beer d:t) {
			System.out.println(d);
		}
		TreeSet<Beer> u = new TreeSet<Beer>(new SortBeerByCost());
		u.add(b1);
		u.add(b2);
		u.add(b3);

		System.out.println("-------");

		for(Beer e:u) {
			System.out.println(e);
		}
		System.out.println("------------");
		System.out.println("--Using ArrayList Sorting--");
		System.out.println("-------------");
		ArrayList<Beer> l = new ArrayList<Beer>();
		l.add(b1);
		l.add(b2);
		l.add(b3);
		Collections.sort(l, new SortBeerByBrand());

		for(Beer b : l) {
			System.out.println(b);
		}
		ArrayList<Beer> k = new ArrayList<Beer>();
		k.add(b1);
		k.add(b2);
		k.add(b3);
		Collections.sort(k, new SortBeerByCost());

		System.out.println("-------");

		for(Beer c : k)
			System.out.println(c);

	}
}
