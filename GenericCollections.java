package collections;

import java.util.ArrayList;

public class GenericCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("minal");
		al.add("xyz");
		al.add("test");
		System.out.println(al);
		for(String s:al) {
			System.out.println(s);
		}
	}

}
