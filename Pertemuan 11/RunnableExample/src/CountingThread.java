
public class CountingThread implements Runnable {

	private String threadName;
	private int stopAt;
	
	public CountingThread(String name) {
		this.threadName = name;
		System.out.println("Creating " + threadName);
	}
	
	public void run() {
		System.out.println("Running " + threadName);
		
		try {
			for (int i = 0; i < 50; i++) {
				System.out.println("Thread " + threadName + ": " + i);
				
				if (this.stopAt == i) {
					return;
				}
				
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread " + threadName + " exiting.");
	}
	
	public void setStopAt(int val) {
		this.stopAt = val;
	}

}
