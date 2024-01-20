package userdefinedobjects;

public class Hotel implements Comparable<Hotel> {
	String name;
    Double rates;
    
    Hotel(String name,double rates){
    	this.name=name;
    	this.rates=rates;
    }
    @Override
    public String toString() {
    	return "Name: "+name+" Ratings: "+rates;
    	
    }
  @Override
   public int compareTo(Hotel x) {
	  return this.rates.compareTo(x.rates);
  }
}
