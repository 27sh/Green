#include <stdio.h>

int main(){
	
	printf("rule : 0은 가위, 1은 바위, 2은 보입니다.\n");
	printf("\n");
	
	int you;
	int me = 0;
	
	printf("숫자를 입력해주세요. : ");
	scanf("%d", &you);
		
	if(you > 2 || you < 0) {
		printf("올바른 입력이 아닙니다.");
	} 
	else {
		if(you == me) printf("you : %d, me : %d. 비겼습니다.", you, me);
		if(you == 1) printf("you : %d, me : %d. 이겼습니다.", you, me);
		if(you == 2) printf("you : %d, me : %d. 졌습니다.", you, me);
	} 
	return 0;
}
