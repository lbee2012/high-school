#include <stdio.h>

int main()
{
	int min,max;
	
	printf("Nhap min: ");
	scanf("%d",&min);
	
	printf("Nhap max: ");
	scanf("%d",&max);
	
	int x=min;
	
	do
	{
	if(x%5==0)
	printf("%d\n",x);
	x++;
	}
	while(x<=max);
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
