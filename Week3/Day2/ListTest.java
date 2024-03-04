package interfaceEx;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		boolean result = list.isEmpty();
		System.out.println("isEmpty : " +result);
		
		list.add("홍길동");
		list.add("임꺽정");
		list.add("일지매");
		list.add("홍길동");
	
		for(String s : list) {
		//	System.out.println(s);
		}
		
		String element = list.get(1);
		//System.out.println(element);
		
		list.add(1, "정우성");
	
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("---------------");
		
		String removeData = list.remove(0);
		System.out.println("removeData : " +removeData);
		for(String s : list) {
			System.out.println(s);
		}
		
		boolean tf = list.contains("공유");
		System.out.println(tf);
		
		int idx = list.indexOf("임꺽정");
		System.out.println("idx : " +idx);
		System.out.println(list.get(idx));
		
		tf = list.isEmpty();
		System.out.println("isEmpty : " +tf);
		
		int size = list.size();
		System.out.println("size : " +size);
		
		//추가 - add(값)
		//삭제 - remove(인텍스)
		//크기 - size()
		//
	}

}
