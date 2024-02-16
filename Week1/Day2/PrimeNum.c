#include <stdio.h>

int main(){
	
	int num;
	int i, t;
	int cnt = 0;
	
	for(num = 2; num <= 1000; num++){
		for(i = 2; i <= num/2; i++){
			if(num % i == 0) {
				t = 1;
				break;	
			}
		}
		if (!t){
			printf("%d ", num);
			cnt++;
		}
		t = 0;
	}
	
	printf("\n");
	printf("1부터 1000까지의 수 중에 소수는 %d 가지 있습니다.", cnt);
	
	return 0;
}
