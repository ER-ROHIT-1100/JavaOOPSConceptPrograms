package userdefinedobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortHotel {

	public static void main(String[] args) {

		ArrayList<Hotel> t = new ArrayList<Hotel>();
		t.add(new Hotel("Taj",7.0));
		t.add(new Hotel("Grand Sheroton",5.2));
		t.add(new Hotel("Arnold",6.5));
		t.add(new Hotel("Marriot Suites",4.3));
		t.add(new Hotel("Hayat",5.8));

		Collections.sort(t);

		for(Hotel l:t) {
			System.out.println(l);
		}
		System.out.println("==========");

		System.out.println(t.get(t.size()-1));
		System.out.println("==========");

		System.out.println(t.get(0));
		System.out.println("==========");
		for(Hotel l:t) {
			if(l.rates>=3.5&&l.rates<=6.5) {
			System.out.println(l);
		}
		}
		System.out.println("==========");
		for(Hotel l:t) {
			if(l.name.startsWith("A")||l.name.startsWith("a")) {
			System.out.println(l);
		}
	}
  }
}
