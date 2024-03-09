package ioPackExamples;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TestExample4 {

	public static void main(String[] args) throws Exception {

		File file = new File("TolloywoodActeressName.txt");

		if (!file.exists()) {
			file.createNewFile();
		} else {
			System.out.println("File with that name already exist");
			System.out.println();
		}

		FileWriter fwriter = new FileWriter(file);

		fwriter.write("KrithiSetti");
		fwriter.write("Srileela");
		fwriter.flush();

		FileReader fReader = new FileReader(file);
				
		int i;

		while ((i = fReader.read()) != -1) {
			
			System.out.print((char) i);
		}

		fReader.close();

	}

}
