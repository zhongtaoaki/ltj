package seventh;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalDemo {

	public static void main(String[] args) {

		// 使用Function接口，实现接收一个Double型参数，返回它的平方。
		Function<Double, Double> function = (r) -> r * r;
		System.out.println(function.apply(3.2));

		// 使用Predicate接口，实现接收一个Integer型正整数，判断它是否为素数，是的话返回true，否的话返回False。
		Predicate<Integer> predicate = (i) -> {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					return false;
				}
			}
			return true;
		};
		System.out.println(predicate.test(17));

		// 使用Supplier接口，实现返回一个存有10个随机Double数的数组。
		Supplier<Double[]> supplier = () -> {

			// Random random = new Random();
			Double[] doubles = new Double[10];

			for (int i = 0; i < doubles.length; i++) {
				// doubles[i] = random.nextDouble();
				doubles[i] = Math.random();
			}
			return doubles;
		};

		// 使用Consumer接口，实现接收一个存有10个Double数的数组 使用3的结果），将每个元素进行平方计算（使用1），输出每个元素的值。
		Consumer<Double[]> consumer = (ds) -> {
			for (Double d : ds) {
				System.out.println(function.apply(d));
			}
		};
		consumer.accept((supplier.get()));

	}
}
