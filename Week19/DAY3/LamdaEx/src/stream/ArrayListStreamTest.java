package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream(); // 스트림 생성
		stream.forEach(s -> System.out.println(s + " "));
		System.out.println();
		
		sList.stream().sorted().forEach(s -> System.out.println(s));
		System.out.println("------------------------------");
		sList.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
	}

}
