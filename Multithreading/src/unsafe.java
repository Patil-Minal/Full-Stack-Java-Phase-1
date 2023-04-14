
class Reserve implements Runnable{

	int available = 1;
	int wanted ;
	
	Reserve(int i){
		wanted = i;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this) {
			System.out.println("available berths: "+available);
			if(available>=wanted) {
				//get passenger name
				String name = Thread.currentThread().getName();
				//alot seat
				System.out.println(wanted +" berth reserved for "+name);
				try {
					Thread.sleep(2000);
					available = available - wanted;
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			else {
				System.out.println("seats not available");
			}
		}
	}
	
}

public class unsafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reserve r = new Reserve(1);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.setName("Minal");
		t2.setName("rutu");
		t1.start();
		t2.start();
		
	}

}
