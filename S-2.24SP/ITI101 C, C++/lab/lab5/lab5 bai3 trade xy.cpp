#include <stdio.h>
void swap(int *a, int *b)
{
	int tg; //trung gian
	tg=*a;
	*a=*b;
	*b=tg;
}
int main()
{
	int x,y;
	
	printf("Nhap a: ");
	scanf("%d",&x);
	
	printf("Nhap b: ");
	scanf("%d",&y);
	
	swap(&x,&y);
	
	printf("a = %d\n",x);
	printf("b = %d",y);
	
	return 0;
}
