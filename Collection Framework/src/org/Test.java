package org;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		
		LinkedList<String> movies = new LinkedList<String>();
        movies.add("KGF");
        movies.add("TIGER ZINDA HAI");
        movies.add("ANIMAL");
        
        Iterator<String> i = movies.iterator();
        while(i.hasNext()){
        	System.out.println(i.next());
        }
	}

}
