package collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("laptop", 1000);
		hm.put("mouse", 5000);
		hm.put("pen", 200);
		
		Set<String> keys = hm.keySet();
		for(String k:keys) {
			System.out.println(k+":"+hm.get(k));
		}
		
	}

}
