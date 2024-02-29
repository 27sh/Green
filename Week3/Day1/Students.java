package test;

import java.util.Scanner;

import day05.Teacher;

public class StudentTest {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        StudentManage sm = new StudentManage(); //메소드 실행을 위해 객체 생성

	        System.out.println("학생관리 프로그램을 실행합니다.");
	        
			int tf = 0;
	        
			Teacher t = new Teacher();
			Student s = new Student();
	        
	        while(tf != 1 && tf != 2) {
				System.out.println("당신의 직업은 무엇입니까? 해당하는 숫자를 눌러주세요.");
				System.out.println("선생님 : 1, 학생 : 2");
				
				Scanner sc2 = new Scanner(System.in);
				tf = sc2.nextInt();
			
				if(tf == 1) {
					t.inputData();
					
					while (true) {
			            System.out.print("1)학생등록 2)학생정보변경(이름) 3)학생정보출력 4)모든학생정보출력 5)프로그램 종료 : ");
			            int option = sc.nextInt();

			            switch(option){
			                case 1 :
			                    sm.regStudent();
			                    break;
			                case 2 :
			                    sm.setStuInfo();
			                    break;
			                case 3 :
			                    sm.showStuInfo();
			                    break;
			                case 4 :
			                    sm.showAllInfo();
			                    break;
			                case 5 :
			                    System.out.println("프로그램을 종료합니다.");
			                    System.exit(0); //매개변수가 0이면 정상종료 됨.

			            }
					}
				}
				else if (tf == 2) {
					s.inputData();
					
					while (true) {
			            System.out.print("1)학생정보출력 2)프로그램 종료 : ");
			            int option = sc.nextInt();

			            switch(option){
			                case 1 :
			                    sm.showStuInfo();
			                    break;
			                case 2 :
			                    System.out.println("프로그램을 종료합니다.");
			                    System.exit(0); //매개변수가 0이면 정상종료 됨.
			            }
					}
				}
				else System.out.println("올바른 입력이 아닙니다.");	
			}

	        
	        }
	    }
package test;

import java.util.Scanner;

public class StudentManage {
	Scanner sc; 
    Student[] students;
    int index;

    public StudentManage(){
        sc = new Scanner(System.in); 
        students = new Student[3]; 
        students[0] = new Student("홍길동", "70");
        index = 1;
    }

   
    public void regStudent(){
      
        if(index < 3){
            System.out.println();
            System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("학점 : ");
            String grade = sc.next();

            Student stu = new Student(name, grade);
            students[index] = stu;
            index++; 

        } else {
            System.out.println("더 이상 등록이 불가합니다.");
        }

    }

    public void setStuInfo(){
        boolean flag2 = true;
        while (flag2){
            System.out.println("학생의 이름를 변경합니다.");
            System.out.print("변경 학생 : ");
            String inputname = sc.next();
            for(int i = 0; i < index ; i++) {
                if(students[i].getName().equals(inputname)){
                    System.out.print("이름 : ");
                    String name = sc.next();
                    System.out.println("변경 완료되었습니다.");
                    flag2 = false;
                    break;
                }
            }
            if(flag2) {
                System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요.");
            }
        }
    }

    //학생정보출력
    public void showStuInfo(){
        boolean flag = true;
        while (flag) {
            System.out.print("정보를 열람할 학생 : ");
            String inPutName = sc.next();

            for(int i = 0 ; i < index ; i++) {
                if(students[i].getName().equals(inPutName)){
                    System.out.println();
                    System.out.println("요청하신 학생의 정보입니다.");
                    students[i].printInfo();
                    flag = false;
                    break;
                }
            }
            if(flag) { 
                System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요.");
            }
        }
    }
    
    public void showStdInfo2() {
    	boolean flag = true;
        while (flag) {
        	Student s = new Student();
            String inPutName = s.inputName;	

            for(int i = 0 ; i < index ; i++) {
                if(students[i].getName().equals(inPutName)){
                    System.out.println();
                    System.out.println("요청하신 학생의 정보입니다.");
                    students[i].printInfo();
                    flag = false;
                    break;
                }
            }
            if(flag) { 
                System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요.");
            }
        }
    }


    public void showAllInfo(){
        if(index == 0 ){
            System.out.println("현재 등록된 학생이 없습니다.");
        }
        else {
            System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 " + index + "명 입니다.");

            for(int i = 0; i < index ; i++){
                students[i].printInfo();
            }
        }
    }
}
package test;

import java.util.Scanner;

public class Student {
	private String name;
    private String grade;
	static int num;
	int cnt;
	String inputName;

	Student(){}

    public Student(String name, String grade){
        this.name = name;
        this.grade = grade;
		cnt = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    //학생의 모든 정보를 출력하는 메소드
    //이름 : 장길동, 나이 : 30, 연락처 : 010-0000-0000, 학점 : B
    public void printInfo(){
        System.out.println("이름 : " + name + ", 학점 : " + grade);
    }
    
	public void inputData() {
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(i == 0) {
			System.out.println("**************");
			System.out.println("   학생 로그인   ");
			System.out.println("**************");
			
			System.out.println("이름과 번호를 입력해주세요.");
			System.out.print("name : ");
			inputName = sc.next();	
			//System.out.print("num : ");
			//int inputPw = sc.nextInt();	
			
			if(name.equals(inputName) /*&& inputPw == num*/) {
				i = 1;
			}
			else {
				System.out.println("입력하신 정보가 맞지 않습니다.");
				System.out.println();
			}
		}	
	}
}
