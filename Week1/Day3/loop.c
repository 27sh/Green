#include <stdio.h>

int main() {
	
	int i = 0;
	int sum = 0;
	int sw = 0;
	
	for (; i  < 100; i++){
		if (sw == 0){
			sum += i;
			sw = 1;
		}
		else {
			sum -= i;
			sw = 0;
		}
	}
	
	printf("%d", sum);

	return 0;
}
