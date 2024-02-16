#include <stdio.h>

int main(){
	
	int num;
	int j;
	
	scanf("%d", &num);
	
	for (j = 2; j <= num; j++){
		if(num % j == 0){
			if(num == j){
				printf("%d 은(는) 소수입니다.", num);
			}
			else printf("%d 은(는) %d 의 약수입니다.", j, num);
			break;
		}
	}
	
	return 0;
}
