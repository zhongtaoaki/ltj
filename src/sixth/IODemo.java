package sixth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IODemo {
	public static void main(String[] args) {

		File file = new File("test.txt");
		try {
			file.deleteOnExit();
			if (file.createNewFile()) {
				System.out.println("文件成功创建");
			}
			// System.out.println(file.getAbsolutePath());
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(1);
			fileOutputStream.write(2);
			fileOutputStream.write(3);
			fileOutputStream.write(4);
			fileOutputStream.close();

			FileInputStream fileInputStream = new FileInputStream(file);

			int result = 0;
			while (result != -1) {
				System.out.println(result);
				result = fileInputStream.read();
			}

			fileInputStream.close();

			// file.deleteOnExit();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
