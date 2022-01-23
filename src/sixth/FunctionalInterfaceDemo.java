package sixth;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		// runnable接口的run方法，没有入参没有返回值
		Runnable runnable = () -> {
			System.out.println("这是runnable接口");
		};

		// 有入参没有返回值
		Consumer<String> consumer = (n) -> {
			System.out.println("这是consumer接口" + n);
		};

		// 有入参有返回值
		Function<Integer, Integer> function = n -> {
			n++;
			return n *= 2;
		};

		// 有入参有返回值，且返回值为boolean
		Predicate<Integer> predicate = n -> n > 2;

	}

}
