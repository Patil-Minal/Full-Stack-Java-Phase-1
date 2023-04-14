package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> mobno = new ArrayList<Integer>();
		mobno.add(12345);
		mobno.add(13456);
		mobno.add(69909);
		mobno.add(68393);
		mobno.add(5566);
		mobno.add(99999);
		mobno.add(99999);
		mobno.add(5566);
		
		System.out.println(mobno);
		
		Set<Integer> uniqueMob = new LinkedHashSet<Integer>();
		uniqueMob.addAll(mobno);
		System.out.println(uniqueMob);
		
	}

}
