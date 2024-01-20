package defaultsorting;

import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		Person p1 = new Person(28,"Tom");
		Person p2 = new Person(21,"Kiran");
		Person p3 = new Person(23,"Danush");
		
		TreeSet<Person> tp=  new TreeSet<Person>();
		tp.add(p1);
		tp.add(p2);
		tp.add(p3);
		
		for(Person p:tp) {
			System.out.println(p);
		}
		
	}
}
