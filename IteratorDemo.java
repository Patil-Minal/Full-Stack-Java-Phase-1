package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList LL = new LinkedList();
		LL.add(10);
		LL.add(20);
		LL.add("abc");
		LL.add("xyz");
		
		System.out.println(LL);
		Iterator itr = LL.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
