package interfaceEx;

public class StringEx {

	public static void main(String[] args) {
		String str = "abcde";
		String str4 = "aaa";
		
		int length = str.length();
		
		System.out.println(length);
		
		char c = str.charAt(1);
		System.out.println(c);

		System.out.println(str.equals("abced"));
		
		System.out.println(str.substring(1, 3));
		
		String s = str.concat("hijk");
		System.out.println(s);
		
		String str2 = "abcdEFG";
		String s2 = str2.toUpperCase();
		String s3 = str2.toLowerCase();

		System.out.println(s2);
		System.out.println(s3);
		
		int idx = str2.indexOf("cd");
		System.out.println(idx);
		
		idx = str2.indexOf("xyz");
		System.out.println(idx);
		
		boolean tf = str2.contains("cd");
		System.out.println(tf);
		
		tf = str2.startsWith("abd");
		System.out.println(tf);
		
		String[] sarray = "I am a boy".split(" ");
		for(String s4 : sarray) {
			System.out.println("s : " +s4);
		}
		

		}
}
