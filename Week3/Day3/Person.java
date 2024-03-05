package day11;

public class Person {

	private String name;
	private String tel;
	
	Person(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	
	public boolean equals(Person p) {
		if(p.name.equals(name) && p.tel.equals(tel))
			return true;
		else
			return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	

}
package day11;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("홍길동", "000-0000-0000");
		Person p2 = new Person("임꺽정", "000-1111-2222");
		Person p3 = new Person("홍길동", "001-0000-0000");
	
		System.out.println(p2.equals(p2));
	}

}
