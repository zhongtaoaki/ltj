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
			if (file.exists()) {
				file.delete();
			}
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
//			BufferedWriter bWriter = new BufferedWriter(fileWriter);
//			for (int i = 0; i < 10; i++) {
//				bWriter.write("这是一行字。");
//				bWriter.newLine();
//			}
//			bWriter.close();
			
			fileWriter.write("这是一行字。");
			fileWriter.flush();

			FileReader fReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			System.out.println(bReader.readLine());
			bReader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
