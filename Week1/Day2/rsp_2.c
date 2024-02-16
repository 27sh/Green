#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
	
	srand(time(NULL));
	printf("rule : 0은 가위, 1은 바위, 2은 보입니다. 3을 입력하면 종료됩니다.\n");
	printf("\n");
	
	int you;
	int me = rand() % 3;
	int win = 0, lose = 0, cnt = 0, draw = 0;
	
	while (1){
		
		cnt ++;
		
		printf("\n");
		printf("숫자를 입력해주세요. : ");
		
		scanf("%d", &you);

		if (you == 3) {
			printf("게임을 종료합니다.");
			cnt --;
			printf("%d 전 %d 승 %d 패 %d 무\n", cnt, win, lose, draw);
			break;
		}
		
		else {
			switch (you) {
			case 0:
				if(you == me) {
					printf("you : 가위, me : 가위. 비겼습니다.\n");	
					draw ++;
					printf("%d 전 %d 승 %d 패 %d 무\n", cnt, win, lose, draw);
				}
				if(me == 2) {
					printf("you : 가위, me : 보. 당신이 이겼습니다.\n");
					win ++;
					printf("%d 전 %d 승 %d 패 %d 무\n", cnt, win, lose, draw);

				}
				if(me == 1) {
					printf("you : 가위, me : 바위. 당신이 졌습니다.\n");
					lose ++;
					printf("%d 전 %d 승 %d 패 %d 무\n", cnt, win, lose, draw);
				}
				break; 
				
			case 1:
				if(you == me) {
					printf("you : 바위, me : 바위. 비겼습니다.\n");
					draw ++;
					printf("%d 전 %d 승 %d 패 %d 무\n", cnt, win, lose, draw);
				}
				if(me == 0) {
					printf("you : 바위, me : 가위. 당신이 이겼습니다.\n");
					win ++;
					printf("%d 전 %d 승 %d 패 %d 무\n", cnt, win, lose, draw);
				}
				if(me == 2) {
					printf("you : 바위, me : 보. 당신이 졌습니다.\n");
					lose ++;
					printf("%d 전 %d 승 %d 패 %d 무\n", cnt, win, lose, draw);
				}
				break;
					
			case 2:
				if(you == me) {
					printf("you : 보, me : 보. 비겼습니다.\n");
					draw ++;
					printf("%d 전 %d 승 %d 패 %d 무\n", cnt, win, lose, draw);
				}
				if(me == 1) {
					printf("you : 보, me : 바위. 당신이 이겼습니다.\n");
					win ++;
					printf("%d 전 %d 승 %d 패 %d 무\n", cnt, win, lose, draw);
				}
				if(me == 0) {
					printf("you : 보, me : 가위. 당신이 졌습니다.\n");
					lose ++;
					printf("%d 전 %d 승 %d 패 %d 무\n", cnt, win, lose, draw);
				}
				break;
				
			default:
				printf("올바른 입력이 아닙니다.\n");
				cnt --;
			}
		}
		
	}
	return 0;
}
