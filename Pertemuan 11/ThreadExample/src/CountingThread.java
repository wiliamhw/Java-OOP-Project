
public class CountingThread extends Thread {

	private String threadName;
	private int stopAt;
	private StringBuilder buffer;
	
	public CountingThread(String name, StringBuilder stringBuffer) {
		this.threadName = name;
		this.buffer = stringBuffer;
		System.out.println("Creating " + threadName);
	}
	
	public void run() {
		System.out.println("Running " + threadName);
		
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println("Thread " + threadName + ": " + i);
				
				if (this.stopAt == i) {
					return;
				}
				
				this.buffer.append(i);
				
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
