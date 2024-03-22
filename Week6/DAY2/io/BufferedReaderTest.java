package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) throws FileNotFoundException {
		String inputData = null;
		
		FileReader flr = new FileReader("sample.txt");
		BufferedReader br = new BufferedReader(flr);
		
		try {
			while((inputData = br.readLine()) != null) {
				System.out.print(inputData);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
