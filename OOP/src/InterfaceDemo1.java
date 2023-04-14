
interface shape{
	void draw();
	default void fill() {
		System.out.println("filling shape");
	}
}

class circle implements shape{

	@Override
	public void draw() {
		System.out.println("Drawing a circle");
		
	}
	
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s = new circle();
		s.fill();
		s.draw();
	}

}
