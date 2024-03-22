package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		int inputData = 0;
		
		System.out.print("데이터를 입력하세요. : ");
		
		try {
			inputData = isr.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("실제 입력된 데이터(정수) : " +inputData);
		System.out.println("실제 입력된 데이터(문자) : " +(char)inputData);
	}

}
