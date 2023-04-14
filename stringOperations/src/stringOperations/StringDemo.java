package stringOperations;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "xyz";
		
		if(s1.compareTo(s2)<0) {
			System.out.println(s1+" is less than "+s2);
		}else if(s2.compareTo(s1)>0) {
			System.out.println(s2+" grester than "+s1);
		}
		else {
			System.out.println("same");
		}
	}
}
