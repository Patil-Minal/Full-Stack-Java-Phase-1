
class MyThread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//execute task one by one
		task1();
		task2();
		task3();
	}
	
	void task1() {
		System.out.println("Task 1");
	}
	void task2() {
		System.out.println("Task 2");
	}
	void task3() {
		System.out.println("Task 3");
	}
}

public class SingleTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 obj = new MyThread1();
		Thread t = new Thread(obj);
		t.start();
	}

}
