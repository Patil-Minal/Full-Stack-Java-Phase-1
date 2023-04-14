
//Two threda performing two task at a time

class MyClass implements Runnable{

	String str;
	MyClass(String str){
		this.str= str;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(str+":"+i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class MultiTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj1 = new  MyClass("cut the cake");
		MyClass obj2 = new  MyClass("Eat food");
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		
	}

}
