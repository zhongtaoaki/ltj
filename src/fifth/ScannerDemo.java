package fifth;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		// int i = 1;

		Scanner scanner = new Scanner(System.in);

		// int j = scanner.nextInt();
		// double d = scanner.nextDouble();

		String string = scanner.nextLine();

		System.out.println(string);

		scanner.close();
	}
}
