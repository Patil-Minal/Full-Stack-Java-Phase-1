
abstract class vehicle {
	abstract void drive();
	void applyBreak() {
		System.out.println("Breakk!!");
	}
}

class car extends vehicle{

	@Override
	void drive() {
		System.out.println("Driving Car!!");	
	}
	
	void changeGear() {
		System.out.println("Changing Gear");
	}	
}

public class abstractclass {
	public static void main(String[] args) {
		//vehicle v = new vehicle(); //error cannot instantiate
		vehicle v = new car();       //abstract class var pointing to car object
		v.drive();
		v.applyBreak();
		//v.changeGear();      // error
		
		car c = new car();
		c.changeGear();
	}
}
