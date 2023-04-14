package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashset - unordered & no duplicate
		HashSet hs = new HashSet();
		hs.add("laptop");
		hs.add("mouse");
		hs.add("keypad");
		hs.add("lense");
		hs.add("lense");
		System.out.println(hs);
		
		//LinkedHashSet - ordered & no duplicate
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("laptop");
		lhs.add("mouse");
		lhs.add("keypad");
		lhs.add("lense");
		lhs.add("lense");
		System.out.println(lhs);
		
		//TreeSet  - sorted & no duplicate
		TreeSet ts = new TreeSet();
		ts.add("laptop");
		ts.add("mouse");
		ts.add("keypad");
		ts.add("lense");
		ts.add("lense");
		System.out.println(ts);
		System.out.println(ts.descendingSet());
	}

}
