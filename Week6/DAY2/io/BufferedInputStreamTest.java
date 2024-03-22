package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamTest {

	public static void main(String[] args) throws IOException {
		int inputData = 0;
		
		FileInputStream fls = new FileInputStream("sample.txt");
		BufferedInputStream bls = new BufferedInputStream(fls);
		
		while((inputData = bls.read()) != -1) {
			System.out.println((char)inputData);
		}
		
		bls.close();
		fls.close();
	}

}
