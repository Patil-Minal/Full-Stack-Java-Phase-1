package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);       //auto boxing
		al.add(20);
		al.add("minal");
		System.out.println(al);   //[10, 20, minal]
		al.add(2, "yyy");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.remove("minal");
		System.out.println(al);
	}

}
