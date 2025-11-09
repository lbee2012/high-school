#include <stdio.h>

int min(int a,int b,int c)
{
	if(a<=b && a<=c)
		printf("So nho nhat la: %d",a);
	else if(b<=a && b<=c)
		printf("So nho nhat la: %d",b);
	else if(c<=a && c<=b)
		printf("So nho nhat la: %d",c);
	else
		printf("Ban nhap ngu.");
}
int main()
{
	int a,b,c;
	int kq;
	
	printf("Nhap vao a: ");
	scanf("%d",&a);
	
	printf("Nhap vao b: ");
	scanf("%d",&b);
	
	printf("Nhap vao c: ");
	scanf("%d",&c);
	
	printf("\n3 so ban vua nhap la: %d %d %d\n\n",a,b,c);
	
	kq=min(a,b,c);
		
	return 0;
}
