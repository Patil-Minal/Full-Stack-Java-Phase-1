package mypackage;

public class typeCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implicit Type casting");
		char a = 'A';
		System.out.println("value a :"+a);
		int b = a;
		System.out.println("value b: "+b);
		float c = a;
		System.out.println("value c: "+c);
		long d = b;
		System.out.println("value d: "+d);
		double e = d;
		System.out.println("value e: "+e);
		
		
		System.out.println("Explicit Type casting");
		long x = 1000;
		
		int n = (int)x;
		System.out.println("Value n: "+n);
		double f = 35.05;
		byte g = (byte)f;
		System.out.println("value g: "+g);
		
		float h = 3.14f; //
		
	}

}
