#include <stdio.h>
#include <string.h>

struct Book{
	char title[30];
	char author[20];
	int price;
};

int main(){
	
	struct Book book;
	strcpy(book.title, "java Programing");
	strcpy(book.author, "james");
	book.price = 15000;

	printf("title : %s\n", book.title);
	printf("author : %s\n", book.author);	
	printf("price : %d\n", book.price);
	
	return 0;
	
}
