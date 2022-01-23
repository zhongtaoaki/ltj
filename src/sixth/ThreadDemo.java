package sixth;

public class ThreadDemo{

	public static int amount = 100;

	public static void main(String[] args) {

		//匿名函數
		//lambda
		//函数式编程
		//Runnable test = () -> System.out.println("这是副线程");

		//把lambda表达式当做一个参数传递给方法
		Thread thread = new Thread(() -> System.out.println("这是副线程"));
		thread.start();

		System.out.println(amount);

		amount -= 60;
		System.out.println(amount);
	}

//	@Override
//	public void run() {
//		System.out.println("这是副线程");
//	}
}
