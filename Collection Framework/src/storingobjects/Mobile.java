package storingobjects;

public class Mobile {
    String brand;
    String modelNo;
    int cost;
    
    Mobile(String brand,String modelNo,int cost){
    	this.brand=brand;
    	this.modelNo=modelNo;
    	this.cost=cost;
    }
    public String toString() {
    	return "Brand "+brand+" "+modelNo+" Cost:Rs."+cost;
    }
}
