package day03;

import java.util.Random;
import java.util.Scanner;

public class Arr2 {

	public static void main(String[] args) {
		
		int flag = 0;
		
		while (flag == 0) {
			System.out.println("게임 방법 : 1부터 9의 위치 중 하나를 골라주세요.");
			System.out.println("          맞는 위치를 고르면 승리합니다.");
			System.out.println();
			System.out.println("**********************************");
			
			System.out.println("┏―――――┳―――――┳―――――┓");
			System.out.println("┃     ┃     ┃     ┃");
			System.out.println("┃  1  ┃  2  ┃  3  ┃");
			System.out.println("┣―――――╋―――――╋―――――┨");
			System.out.println("┃     ┃     ┃     ┃");
			System.out.println("┃  4  ┃  5  ┃  6  ┃");
			System.out.println("┣―――――╋―――――╋―――――┨");
			System.out.println("┃     ┃     ┃     ┃");
			System.out.println("┃  7  ┃  8  ┃  9  ┃");
			System.out.println("┗―――――┻―――――┻―――――┛");
			
			System.out.println();
			System.out.println("**********************************");
			
			int i = 3;
			int m = 3;
			int cnt = 1;
			int[] rd = new int[9];
			
			int[][] arr = new int[i][m];
			
			for(int k = 0; k < i; k++) {
				for(int w = 0; w < m; w++) {
					arr[k][w] = 0;
				}
			}
		
			Random r = new Random();
			
			int rndNum = r.nextInt(9) + 1;
			
			//System.out.println(rndNum);
			
			
			System.out.print("값을 입력해주세요 : ");
			Scanner sc = new Scanner(System.in);
			
			int scNum = 0;
					
			switch(rndNum) {
				case 1 : arr[0][0] = 1;
					break;
				case 2 : arr[0][1] = 1;
					break;
				case 3 : arr[0][2] = 1;
					break;
				case 4 : arr[1][0] = 2;
					break;
				case 5 : arr[1][1] = 1;
					break;
				case 6 : arr[1][2] = 1;
					break;
				case 7 : arr[2][0] = 1;
					break;
				case 8 : arr[2][1] = 1;
					break;
				case 9 : arr[2][2] = 1;
					break;
			}
			
			while(cnt <= 5) {
				 scNum = sc.nextInt();

				if(scNum < 1 || scNum > 9) {
					System.out.println("올바르지 않은 입력입니다.");
					cnt--;
				}
				else if(scNum == rndNum) {
					System.out.println("정답입니다!");
					System.out.println(cnt + "회 만에 맞추셨습니다!");
					break;
				}
				else {
					System.out.println("정답이 아닙니다. 시도 횟수 : " +cnt+ "회");
				}
				cnt++;
			}
			
			if(scNum != rndNum) {
				System.out.println("정답은 " +rndNum+ "번 이었습니다.");
			}
			
			System.out.println("**********************************");
			
			System.out.println("이제 제가 맞춰볼게요.");
			System.out.print("숫자를 하나 정해주세요. : ");
			
			scNum = sc.nextInt();
			cnt =1;
			
			int j = 0;

			while(cnt <= 5) {
				for(int x = 0; x < 5; x++) {
					rndNum = r.nextInt(9) + 1;
					rd[x] = rndNum;
					for(int z = 0; z < x; z++) {
						if(rd[x] == rd[z]) {
							z--;
							break;
						}
					}
				}
				
				if(scNum == rd[j]) {
					System.out.println(rd[j]+ " 맞죠?");
					System.out.println(cnt + "번 만에 맞췄어요!");
					break;
				}
				else {
					System.out.println(rd[j]+ "인가요?");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(cnt < 5) {
						System.out.println("다시 한 번 해볼게요.  시도 횟수 : " +cnt+ "회");
					}
				}
				cnt++;			
			}
			
			if(scNum != rd[j]) {
				System.out.println("정답은 " +scNum+ "번 이었군요.");
			}
			
			System.out.println("게임 종료");
			
			System.out.println();
			System.out.println("다시 하시겠습니까?");
			System.out.print("0 : 다시 시작, 1 : 창 닫기");
			
			flag = sc.nextInt();
			
			if(flag == 0) {
				for (int x = 0; x < 80; x++)
				      System.out.println("");
			}
		}
		
	}
	

}
