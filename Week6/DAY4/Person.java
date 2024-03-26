import java.io.Serializable;

public class Person implements Serializable {
	
	private static final long serialVersionUID = -5530710341851346247L;
	
	String name;
	String city;
	transient int age;
	
	public Person(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+" : "+city+" : " +age;
	}
}
