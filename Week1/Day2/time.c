#include <stdio.h>

int main(){
	
	int i = 0;
	
	while(i <= 24){
		if(i == 7) printf("%d 시 입니다. 일어나세요.\n", i);
		else printf("%d 시 입니다.\n", i); 
		i++;
	}
	return 0;
}
