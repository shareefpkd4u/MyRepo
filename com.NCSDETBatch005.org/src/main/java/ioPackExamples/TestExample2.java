package ioPackExamples;

import java.io.File;

public class TestExample2 {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\91900\\Documents\\Batch005\\IOPackExamples");

		String[] allFiles = f.list();

		for (String file : allFiles) {
			System.out.println(file);
		}

	}

}
