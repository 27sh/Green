#include <stdio.h>

int main(){
	
	int cnt = 0;
	int num;
	
	for(num=1; num <=1000; num++){
		if (num % 3 == 0 && num % 5 == 0){
			cnt ++;
			printf("%d\n", num);
		}	
	} 
	
	printf("1부터 1000까지의 수 중 3의 배수이면서 5의 배수인 수는 %d 개 있습니다.", cnt);
	return 0;
}
