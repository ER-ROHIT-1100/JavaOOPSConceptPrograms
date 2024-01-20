package mapexample;

import java.util.Set;
import java.util.TreeMap;

public class MainRunner {

	public static void main(String[] args) {
	//	SortCarByCost cost = new SortCarByCost();
		TreeMap<Car,String> map = new TreeMap<Car,String>(new SortCarByCost());
		map.put(new Car(6000), "Audi");
		map.put(new Car(2000), "Suzuki");
		map.put(new Car(4000), "BMW");
		
		Set<Car> key = map.keySet();
		for(Car c:key) {
			System.out.println("Cost of "+map.get(c)+" Car is Rs."+c);
		}
		
	}

}
