
class Mythread extends Thread{
	public void run() {
		for(int i = 0;i<=1000;i++) {
			System.out.println(i);
		}
		
	}
}

public class threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t = new Mythread();
		
		//create thread  and attach class object to it
		Thread th = new Thread(t);
		t.start();
	}

}
