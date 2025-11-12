#include <stdio.h>
int denn()
{
	int n,i;
	int tong=0;
	
	printf("Nhap n: ");
	scanf("%d",&n);
	
	for(i=0;i<=n;i++)
	tong=tong+i;
	
	return tong;
}
int main()
{
	int kq;
	
	kq=denn();
	
	printf("Tong tu 0 den n la: %d",kq);
	
	return 0;
}
