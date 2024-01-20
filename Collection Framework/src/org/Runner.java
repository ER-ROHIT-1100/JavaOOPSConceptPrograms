package org;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
        l.add("Web");
        l.add("Sql");
        l.add("Java");
        
        System.out.println(l);
        
        Collections.sort(l);
        System.out.println(l);
        
        Collections.reverse(l);
        System.out.println(l);
	}

}
