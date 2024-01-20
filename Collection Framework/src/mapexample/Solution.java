package mapexample;

import java.util.LinkedHashMap;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {

		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(10,"Apple");
		map.put(20, "Samsung");
		map.put(30,"Oneplus");
        // Convert Map into Set to Store keys using keySet().
		Set<Integer>keys =map.keySet(); // 10 20 30
      
		// Traverse Keys 
		for(int key:keys) {
        System.out.println(key+"->"+map.get(key));
        
	}
  }
}
/**
 * 1.Convert Map into Set to Store keys using keySet().
 * 2. Traverse Keys (Set) using for-each loop & get the value using get().
 */
