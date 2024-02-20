#include <stdio.h>

int main(){
	
	int n =10, m = 5;
	
	printf("%d + %d = %d\n", n, m, sum(n, m));
	printf("%d - %d = %d\n", n, m, sub(n, m));
	printf("%d * %d = %d\n", n, m, mul(n, m));
	printf("%d / %d = %d\n", n, m, div(n, m));
	
	return 0;
	
}

int sum(int n, int m){
	return n + m;
}

int sub(int n, int m){
	return n - m;
}

int mul(int n, int m){
	return n * m;
}

int div(int n, int m){
	return n / m;
}
