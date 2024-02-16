#include <stdio.h>
#include <stdlib.h>

int main(){
	
	printf("rule : 0은 가위, 1은 바위, 2은 보입니다. 3을 입력하면 종료됩니다.\n");
	printf("\n");
	
	while (1){
		int you;
		int me = rand() % 3;
		
		printf("\n");
		printf("숫자를 입력해주세요. : ");
		
		scanf("%d", &you);

		if (you == 3) {
			printf("게임을 종료합니다.");
			break;
		}
		
		else {
			switch (you) {
			case 0:
				if(you == me) printf("you : 가위, me : 가위. 비겼습니다.\n");
				if(me == 2) printf("you : 가위, me : 보. 당신이 이겼습니다.\n");
				if(me == 1) printf("you : 가위, me : 바위. 당신이 졌습니다.\n");
				break; 
				
			case 1:
				if(you == me) printf("you : 바위, me : 바위. 비겼습니다.\n");
				if(me == 0) printf("you : 바위, me : 가위. 당신이 이겼습니다.\n");
				if(me == 2) printf("you : 바위, me : 보. 당신이 졌습니다.\n");
				break;
					
			case 2:
				if(you == me) printf("you : 보, me : 보. 비겼습니다.\n");
				if(me == 1) printf("you : 보, me : 바위. 당신이 이겼습니다.\n");
				if(me == 0) printf("you : 보, me : 가위. 당신이 졌습니다.\n");
				break;
				
			default:
				printf("올바른 입력이 아닙니다.\n");

			}
		}
		
	}
	return 0;
}
