import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOTest {

	public static void main(String[] args) throws IOException {
		// DataInput/OutputStream : 자료형을 유지하면서 데이터를 파일에 쓰고, 읽기
	
		File file = new File("temp.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		// 데이터의 기본형을 유지하면서 파일에 데이터를 기록한다.
		dos.writeBoolean(true);
		dos.writeChar('A');
		dos.writeInt(123);
		dos.writeFloat(3.14F);
		dos.writeDouble(1234.5678);
		dos.writeUTF("Java is Fun");
		
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		
		//데이터의 기본형을 유지하면서 데이터를 읽어 출력한다.
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		
		dos.close();
		dis.close();
	}

}
