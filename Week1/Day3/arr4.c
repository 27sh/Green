	#include <stdio.h>
	#include <stdlib.h>
	#include <time.h>
	
	int main() {
		
		srand(time(NULL));
		
		int a[50] = {0, };
		int b[50] = {0. };
		int c[50] = {0, };
		
		int rNum = rand() % 100;
		int i, j = 0, k = 0;
		 
		printf("a 배열 : ");

		 
		for(i = 0; i < 50; i++){
			int rNum = rand() % 100;
			a[i] = rNum;
			printf("%d ", a[i]);
		}
		
		printf("\n");
		printf("\n");

		
		for(i = 0; i < 50; i++){
			if(a[i] % 2 == 0){
				b[j] = a[i];
				j++;
			}
			else {
				c[k] = a[i];
				k++;
			}
		}
		 
		printf("b 배열 : ");
		
		for(i = 0; i < j; i++){
			printf("%d ", b[i]);
		}
		
		printf("\n");
		printf("\n");
		
		printf("c 배열 : ");
		
		for(i = 0; i < k; i++){
			printf("%d ", c[i]);
		}
		 
		return 0;
	}
