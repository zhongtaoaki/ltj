package sixth;

public class ConcurrentDemo extends Thread {

	public  int count = 0;

	public static void main(String[] args) {

		ConcurrentDemo thread = new ConcurrentDemo();
		thread.start();
		
		while (thread.isAlive()) {
			System.out.println("waiting...");
		}
		System.out.println(thread.count);
		thread.count++;
		System.out.println(thread.count);
	}

	@Override
	public void run() {
		count++;
	}
}
