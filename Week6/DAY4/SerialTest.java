import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialTest {

	public static void main(String[] args) throws IOException {
		
		// 직렬화된 객체를 2진수로 기록할 파일을 지정하여
		// 객체를 기록할 수 있는 ObjectOutputStream 객체를 생성한다.
		FileOutputStream fos = new FileOutputStream("Person.sel");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// 직렬화된 객체를 2개 생성한다.
		Person p1 = new Person("홍길동", "서울", 32);
		Person p2 = new Person("James", "부산", 42);
		
		// 직렬화된 객체를 파일에 2진수로 기록한다.
		oos.writeObject(p1);
		oos.writeObject(p2);
		
		oos.close();
		System.out.println("객체가 파일에 직렬화되어 기록되었습니다.");
	}

}
