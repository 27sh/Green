	#include <stdio.h>
	
	int main() {
		
		int a[10] = {0, };
		int b[5] = {0, };
		int c[5] = {0, };
		
		int i, j = 0, k = 1;
		
		for(i = 0; i < 10; i++){
			a[i] = 10 - i;
			printf("%d ", a[i]); //확인용 
		}
		
		printf("\n");
		printf("\n");
		
		for(i = 0; i < 5; i++){
			b[i] = a[k];
			c[i] = a[j];
			
			j += 2;
			k += 2;
			
			printf("b[%d] = %d, c[%d] = %d\n", i, b[i], i, c[i]);
		}
	
		return 0;
	}
