package ioPackExamples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TestExample6 {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("StudentNames.txt");

		pw.print(true);
		pw.println();
		pw.print(9848022338L);
		pw.println();
		pw.print('S');

		pw.flush();

	}

}
