package ioPackExamples;

import java.io.File;
import java.io.IOException;

public class TestExample1 {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\91900\\Documents\\Batch005\\IOPackExamples\\Batch005.txt");

		if (!f.exists()) {
			f.createNewFile();
		} 
		else {
			System.out.println("File Already Exist");
		}

		File f2 = new File("C:\\Users\\91900\\Documents\\Batch005\\IOPackExamples\\Job");

		f2.mkdir();
	}
}



