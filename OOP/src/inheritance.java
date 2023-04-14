class base{
	int i;
	int j;
	
	void inputIJ(int i, int j) {
		this.i = i;
		this.j = j;
	}
	void display() {
		System.out.println("I: "+i+" J: "+j);
	}
}

class derived extends base{
	int k;
	
	void inputK(int k) {
		this.k = k;
	}
	
	void displayK() {
		System.out.println("K: "+k);
	}
}


public class inheritance {
	public static void main(String[] args) {
		base b = new base();  //b.i = 0 b.j =0
		b.inputIJ(10, 20);
		b.display();     //b.i = 10, b.j=20
		
		derived d = new derived();  //i=0, j=0, k=0
		d.inputIJ(30, 40);       //d.i=30, d.j =40
		d.display();   //i=30,j=40
		d.inputK(50);        //d.k = 50
		d.displayK();    //k=50
		
	}
	
}
