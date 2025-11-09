#include <stdio.h>
int tinhtong()
{
	int a,b,tong;
	
	printf("Nhap a: ");
	scanf("%d",&a);
	
	printf("Nhap b: ");
	scanf("%d",&b);
	
	tong=a+b;
	
	return tong;
} 
int main()
{
	int kq;
	
	kq=tinhtong();
	
	printf("Tong la: %d",kq);
	
	
	
	return 0;
}
