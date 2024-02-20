#include <stdio.h>

int main(){
	int a[10] = {10, 20, 16, 32, 1, 8, -3, -9, 100, 50};
	
	int ch = a[0], tp = 0;
	int i;
	
	for(i = 1; i < 10; i++){
		if(ch < a[i]) {
			ch = a[i];
			tp = i;	
		}
	}
	
	printf("배열 a의 최댓값은 %d 이며, 그 값의 위치는 a[%d]에 위치한다.", ch, tp);
	
	return 0;
	
}
