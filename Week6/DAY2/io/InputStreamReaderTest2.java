package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest2 {

	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		int inputData = 0;
		char[] temp = new char[10];
		
		System.out.print("데이터를 입력하세요 : ");
		
		try {
			inputData = isr.read(temp);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < inputData; i++) {
			System.out.print(temp[i]);
		}
	}

}
