package ioPackExamples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TestExample5 {

	public static void main(String[] args) throws Exception {

		File file = new File("StudentNames.txt");

		if (!file.exists()) {
			file.createNewFile();
		} else {
			System.out.println("File Already Exist");
		}

		FileWriter fw = new FileWriter(file);

		BufferedWriter bWriter = new BufferedWriter(fw);

		bWriter.write("Shameera");
		bWriter.newLine();
		bWriter.write("Archana");
		bWriter.newLine();
		bWriter.write("Aruna");
		bWriter.newLine();
		bWriter.write("Rohini");
		bWriter.newLine();
		bWriter.write("Srikar");

		bWriter.flush();

		Thread.sleep(5000);

		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr);

		String str;

		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}

	}
}
