package defaultsorting;

public class Car implements Comparable<Car> {
	int cost;
	//String name;
	
	 Car(int cost){
		 this.cost=cost;
		// this.name=name;
	 }
	 @Override
	 public String toString() {
		 return "Cost: "+cost;
		 
	 }
	 @Override
	public int compareTo(Car c) {
		 return this.cost-c.cost;
	 }

}
