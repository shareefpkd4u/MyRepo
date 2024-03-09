package ioPackExamples;

import java.io.File;
import java.io.FileWriter;

public class TestExample3 {

	public static void main(String[] args) throws Exception {

		File f = new File("HeroNames.txt");

		if (!f.exists()) {
			f.createNewFile();
		} 
		else {
			System.out.println("File Already Exist");
		}

		FileWriter fw = new FileWriter(f, true);
		fw.write("Shameera");
		fw.write("Navalika");
		fw.write("Srikar");
		fw.write("Sudhakar");

		fw.flush();
		
		fw.close();

	}

}
