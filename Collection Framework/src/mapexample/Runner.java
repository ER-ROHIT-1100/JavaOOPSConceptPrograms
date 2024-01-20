package mapexample;

import java.util.Set;
import java.util.TreeMap;

public class Runner {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
        map.put(50,"Rahul");
        map.put(40,"Ganesh");
        map.put(30,"Vishnu");
        
        Set<Integer> key =map.keySet();
        
        for(int i:key) {
        	System.out.println(i+" "+map.get(i));
        }       
	}
}
