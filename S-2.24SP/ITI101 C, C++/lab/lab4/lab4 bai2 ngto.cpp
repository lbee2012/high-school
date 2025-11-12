#include <stdio.h>

int main()
{
	int x,i;	
	int biendem = 0;
	
	printf("Nhap vao so X can ktra: ");
	scanf("%d",&x);
	
	for(i=2;i<x;i++)
	
	if(x%i==0)
		biendem++;
		
	if(biendem==0)
		printf("X chinh la so nguyen to.");
	else
		printf("X deo phai so nguyen to.");
	
	return 0;
}
