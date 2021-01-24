
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Beginning of main");
		
		CountingThread ct1 = new CountingThread("1");
		ct1.setStopAt(200);
		Thread t1 = new Thread(ct1);
		t1.start();
		
		CountingThread ct2 = new CountingThread("2");
		ct2.setStopAt(300);
		Thread t2 = new Thread(ct2);
		t2.start();
		
		/*
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		System.out.println("End of main");
	}

}
