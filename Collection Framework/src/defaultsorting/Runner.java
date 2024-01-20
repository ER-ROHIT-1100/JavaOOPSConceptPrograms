package defaultsorting;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {
	
	

	public static void main(String[] args) {
		Car c1 = new Car(200);
		Car c2 = new Car(100);
		Car c3 = new Car(300);
		
		ArrayList<Car> t = new ArrayList<Car>();
		t.add(c1);
		t.add(c2);
		t.add(c3);
		
		Collections.sort(t);
		
		for(Car c:t) {
			System.out.println(c);
		}
	}
}
