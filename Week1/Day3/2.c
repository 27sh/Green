#include <stdio.h>

int main() {
	unsigned int a = 12;
	unsigned int b = 10;
	
	printf("a & b = %u\n", a & b);
	
	printf("a | b = %u\n", a | b);
	
	printf("a ^ b = %u\n", a ^ b);
	
	printf("~a = %u\n", ~a);
	
	printf("a << 1 = %u\n", a << 1);
	
	printf("a >> 1 = %u\n", a >> 1);

	return 0;
}
