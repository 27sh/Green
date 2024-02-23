	package day02;
	
	public class Student {
		private int stdNum;
		private String name;
		private int math;
		private int kor;
		private int eng;
	
		Student(){}
		
		Student(int stdNum, String name, int kor, int eng, int math){
			this.stdNum = stdNum;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		public String showInfo() {
			String n = "번호 : " + stdNum + " 이름 : " +name+ " 국어 : " +kor+ " 영어 : " +eng+ " 수학 : " +math;
			
			return n;
		}
		
		
		public void setStdNum(int stdNum){
			this.stdNum = stdNum;
		}
		
		public int getStdNum() {
			return stdNum;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public void setMath(int math) {
			this.math = math;
		}
		
		public int getMath() {
			return math;
		}
		
		public void setKor(int kor) {
			this.kor = kor;
		}
		
		public int getKor() {
			return kor;
		}
		
		public void setEng(int eng) {
			this.eng = eng;
		}
		
		public int getEng() {
			return eng;
		}
		
	}
