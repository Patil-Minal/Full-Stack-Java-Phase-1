
public class CurrentThread {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: "+t);
		System.out.println("Thread name: "+t.getName());
	}
}
