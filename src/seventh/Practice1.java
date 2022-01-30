package seventh;

public class Practice1 {

	public static int count = 1;
	public static int state = 1;

	public static void main(String[] args) {
		final Object lock = new Object();

		new Thread(() -> {
			for (int i = 0; i < 4; i++) {
				synchronized (lock) {
					while (state != 1) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					for (int j = 0; j < 5; j++) {
						System.out.println(Thread.currentThread().getName() + " :" + count++);
					}
					state = 2;
					lock.notifyAll();
				}
			}
		}, "线程1").start();

		new Thread(() -> {
			for (int i = 0; i < 4; i++) {
				synchronized (lock) {
					while (state != 2) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					for (int j = 0; j < 5; j++) {
						System.out.println(Thread.currentThread().getName() + " :" + count++);
					}
					state = 3;
					lock.notifyAll();
				}
			}
		}, "线程2").start();

		new Thread(() -> {
			for (int i = 0; i < 4; i++) {
				synchronized (lock) {
					while (state != 3) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					for (int j = 0; j < 5; j++) {
						System.out.println(Thread.currentThread().getName() + " :" + count++);
					}
					state = 1;
					lock.notifyAll();
				}
			}
		}, "线程3").start();
	}
}
