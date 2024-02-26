package day03;

public class GetBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std1 = new Student("홍길동", 5000);
		Student std2 = new Student("임꺽정", 10000);
		Student std3 = new Student("이순신", 90000);
		
		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);
		Bus bus3 = new Bus(300);
		
		std1.takeBus(bus1);
		
		std1.studentInfo();
		bus1.busInfo();
	}

}
