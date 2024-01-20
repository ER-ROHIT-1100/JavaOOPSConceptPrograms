package mapexample;

import java.util.HashMap;

public class Demo {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(10,"Java");
		map.put("Python",12.3);
		map.put(6.9,555);
		
		System.out.println(map);// {6.9=555, 10=Java, Python=12.3}.
		System.out.println(map.get(10)); // Java
		System.out.println(map.get(200)); // null
		System.out.println(map.containsKey("python")); // False
		System.out.println(map.containsValue("Java")); // True
		System.out.println(map.size()); // 3
		System.out.println("-------");
		
		System.out.println(map); // {6.9=555, 10=Java, Python=12.3}
		map.remove(10); 
		System.out.println(map); //{6.9=555, Python=12.3}
		System.out.println("-------");
		
		System.out.println(map.isEmpty()); // False
		map.clear();
		System.out.println(map.isEmpty()); // True
	}
}
	