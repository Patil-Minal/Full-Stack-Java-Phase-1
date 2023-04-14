class base1{
	int i;
	int j;
	void input(int i, int j) {
		this.i = i;
		this.j = j;
	}
	void display() {
		System.out.println("I: "+i+" J: "+j);
	}
}
class derived1 extends base1{
	int k;
	
	void input(int k) {      //overloaded method
		this.k = k;
	}
	void display() {         //overriden method
		super.display();
		System.out.println("K: "+k);
	}
}


public class inheritance02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		base1 b = new base1();
		b.input(10, 20);     
		b.display();       //i=10,j=20
		
		derived1 d = new derived1();
		d.input(30,40);
		d.input(50);
		d.display();  // i=30,j=40,k=50
	}

}
