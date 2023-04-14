
class myClass{
	int m; //instance or non-static var
	static int n;  //static var or class var
	
	void x() {             //non static method
		m = 10;
		n = 20;
	}
	
	static void y() {        //static method or class method
		//m = 30;       //error cannot reference to non static var from static 
		n = 40;
	}
	
	void display() {
		System.out.println("M: "+m+" N: "+n);
	}
	
}

public class staticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myClass mc = new myClass();
		mc.x();
		mc.display();             //m:10 n:20
		myClass mc2 = new myClass();
		mc2.display();         //m:0 n:20
		
		mc.y();
		mc.display();    //m:10 n:40
		mc2.display();   //m:0 n:40
		
		myClass.n = 50;
		mc.display();      //m:10 n:50
		mc2.display();    //m:0  n:50
		
	}

}
