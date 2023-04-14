package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		hm.put("name", "minal");
		hm.put("color","blue");
		hm.put("page", 30);
		hm.put("birds","parrot");
		System.out.println(hm);
		
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("name", "minal");
		lhm.put("color","blue");
		lhm.put("page", 30);
		lhm.put("birds","parrot");
		System.out.println(lhm);
		
		TreeMap tm = new TreeMap();
		tm.put("name", "minal");
		tm.put("color","blue");
		tm.put("page", 30);
		tm.put("birds","parrot");
		System.out.println(tm);
		System.out.println(tm.descendingMap());
	}

}
