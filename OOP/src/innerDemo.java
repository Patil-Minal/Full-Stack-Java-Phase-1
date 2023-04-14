
class outer{
	int m=100;
	class inner{
		void dostuff() {
			System.out.println("Do your stuff m: "+m);
		}
	}
}

public class innerDemo {
	public static void main(String[] args) {
		outer.inner obj = new outer().new inner();
		obj.dostuff();
	}
}
