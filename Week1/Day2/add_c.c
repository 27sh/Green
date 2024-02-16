#include <stdio.h>

int main(){
	
	int sum, num;
	
	sum = 0;
	num = 1;
	
	
	while(num <= 10){
		sum = sum + num;
	
		num = num + 1;
	
	}
	
	printf("sum : %d\n", sum);
	printf("num : %d", num);
	return 0;
}
