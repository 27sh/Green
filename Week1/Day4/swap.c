#include <stdio.h>

int main(){
	
	int a = 10, b = 5;
		
	swap(&a, &b);
	
	printf("a = %d, b = %d", a, b);
	
	return 0;
	
}

void swap(int *a, int *b){

	int tmp = 0;
	
	tmp = *a;
	*a = *b;
	*b = tmp;

}
