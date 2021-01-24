
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();

		CountingThread t1 = new CountingThread("1", sb);
		t1.setStopAt(1000);
		t1.start();
		
		
		CountingThread t2 = new CountingThread("2", sb);
		t2.setStopAt(1000);
		t2.start();
		
		/*
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		System.out.println("Result: " + sb.toString());
	}

}
