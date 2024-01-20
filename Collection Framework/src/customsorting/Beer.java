package customsorting;

public class Beer {
  private String brand;
  private int cost;
  
  public Beer(String brand,int cost) {
	  this.brand=brand;
	  this.cost=cost;
	  
  }
  public String getbrand() {
	  return brand;
  }
  public int getCost() {
	  return cost;
  }
  @Override
  public  String toString() {
	  return "Cost of "+brand+" is Rs. "+cost;
  }

}
