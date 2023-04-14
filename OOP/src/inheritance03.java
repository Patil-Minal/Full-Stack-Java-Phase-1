class Base3{
	int j;
	int i;
	Base3(int i,int j){
		this.i = i;
		this.j = j;
	}
	
	Base3(){}
	
	void display() {
		System.out.println("i: "+i+" j: "+j);
	}
}

class Derived3 extends Base3{
	int k;

	public Derived3(int k) {
		//super();       //added implicitly invokes base class default constructor
		super(30,40);
		this.k = k;
	}

	public Derived3(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}
	
	void display() {
		super.display();
		System.out.println("k: "+k);
	}
	
}

public class inheritance03 {
	public static void main(String[] args) {
		Base3 b = new Base3(10,20);
		b.display();      //i=10,j=20
		
		Derived3 d = new Derived3(50);
		d.display();  // i=30,j=40,k=50
		
		Derived3 d1 = new Derived3(60,70,80);
		d1.display(); //i=60,j=70,k=80
	}
}
