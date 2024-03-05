package list;

import java.util.HashSet;

public class SetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> strSet = new HashSet<>();
		
		String[] str = new String[]{"사과", "사과", "바나나", "토마토"};
		
		for(int i = 0; i <str.length;i++) {			
			if(strSet.contains(str[i])) {
				System.out.println(str[i] + "는 중복되는 단어입니다.");
			}
			strSet.add(str[i]);
		}
		
		System.out.println(strSet);
		
		System.out.println("---------------");
		
		System.out.println(strSet.size());
	}

}
