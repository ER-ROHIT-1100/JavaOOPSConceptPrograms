package storingobjects;

import java.util.ArrayList;

public class MainRunner {

	public static void main(String[] args) {
		ArrayList<Mobile> l = new ArrayList<Mobile>();
		l.add(new Mobile("Apple","15 Pro",80000));
		l.add(new Mobile("One Plus","Nord 5g",25000));
		l.add(new Mobile("Vivo","11 4g",20000));
		l.add(new Mobile("Redmi","Xperia",45000));
		l.add(new Mobile("Oppo","ultra pro",60000));
		
		for(Mobile m:l) {
			if(m.cost>10000&&m.cost<50000) {
			  System.out.println(m);
		}
	}
  }
}
