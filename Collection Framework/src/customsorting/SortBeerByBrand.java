package customsorting;

import java.util.Comparator;

public class SortBeerByBrand implements Comparator<Beer> {
   @Override
   public int compare(Beer x,Beer y) {
	   String i = x.getbrand();
	   String j = y.getbrand();
	   return i.compareTo(j);
	   
	   //return x.getbrand().compareTo(y.getbrand());
	   
   }	
}
// x --> current object to be inserted & y --> already existing object.
// return y.getbrand().compareTo(x.getbrand());