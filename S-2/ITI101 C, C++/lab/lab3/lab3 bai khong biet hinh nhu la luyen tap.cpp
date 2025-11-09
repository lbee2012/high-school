#include<stdio.h>
int main()
{
	float dt;
	
	printf("Nhap dt: ");
	scanf("%f",&dt);
	
	if(dt>=5 && dt<=10)
	printf("Chuc mung b qua mon");
	
	else if(dt>=0 && dt<=5)
	printf("Chuc mung b truot mon");
	
	else
	printf("B bi ngu a`?");
	
	return 0;
}
