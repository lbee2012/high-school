#include <stdio.h>

int main()
{
	int x,i;
	int biendem = 0;
	
	printf("Nhap vao so X can ktra: ");
	scanf("%d",&x);
	
	for(i=1;i<x;i++)
	
	if(i*i==x)
		biendem++;
		
	if(biendem==0)
		printf("X khong phai so chinh phuong.");
	else
		printf("X chinh la so chinh phuong.");
		
	return 0;
}
