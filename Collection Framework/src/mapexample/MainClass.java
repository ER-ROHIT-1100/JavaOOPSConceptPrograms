package mapexample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MainClass  {

	public static void main(String[] args) {
	  Map<String,Double> m = new LinkedHashMap<String,Double>();
	  m.put("Virat",11.5);
	  m.put("Karan",9.8);
	  m.put("Sanket",8.7);
	  
	  Set<String>key=m.keySet();
	  for(String s:key) {
		  System.out.println("Salary of "+s+" is "+m.get(s)+" LPA");
	 }	  
  }
}
