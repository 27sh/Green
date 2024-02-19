	#include <stdio.h>
	#include <stdlib.h>
	#include <time.h>
	
	int main() {
		
		srand(time(NULL));
		
		int a[50] = {0, };
		
		int rNum = rand() % 100;
		int i, cnt = 0;
		 
		//printf("a 배열 : ");

		 
		for(i = 0; i < 50; i++){
			int rNum = rand() % 100;
			a[i] = rNum;
			//printf("%d ", a[i]);
		}
		/*		
		printf("\n");
		printf("\n");
		*/
		
		for(i = 0; i < 50; i++){
			if (a[i] == 30){
				printf("값 30은 %d 번째 index에 위치하고 있습니다.", i);
				cnt = 1;
				break;	
			}
		}
		
		if (cnt == 0){
			printf("-1");
		}
		
		 
		return 0;
	}
