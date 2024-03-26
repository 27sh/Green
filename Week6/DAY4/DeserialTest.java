import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialTest {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("Person.sel");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person p1 = (Person)ois.readObject();
		Person p2 = (Person)ois.readObject();
		
		System.out.println(p1);
		System.out.println(p2);
		
		ois.close();
	}

}
