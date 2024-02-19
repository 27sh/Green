#include <stdio.h>

int main() {
	
	int arr[4] = {0, 0, 0, 0};
	int i;
	
	for(i = 0; i < 4; i++){
		arr[i] = i + 1;
		printf("arr[%d] = %d\n", i, arr[i]); 
	}

	return 0;
}
