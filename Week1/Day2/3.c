#include <stdio.h>

int main(){
	
	int num = 310;
	
	if (num % 3 == 0){
		printf("%d 은(는) 3의 배수입니다.\n", num);
	}
	else printf("%d 은(는) 3의 배수가 아닙니다.\n", num);
	
	return 0;
}
