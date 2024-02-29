package day06;

public class ManageTell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] m = new Member[3];
		
		m[0] = new Member("홍길동", "010-1111-2222", 'M');
		m[1] = new Member("임꺽정", "010-1234-5678", 'M');
		m[2] = new Member("일지매", "010-9999-8888", 'F');
		
		for(Member i : m) {
			System.out.println(i.toString());
		}
		
	}

}

package day06;

public class Member {
	private String name;
	private String tell;
	private char gender;
	
	Member(){}
	
	Member(String name, String tell, char gender){
		this.name = name;
		this.tell = tell;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " +name+ ", 전화번호 : " +tell+ ", 성별 : " +gender;
	}

}


