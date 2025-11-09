#include <stdio.h>

int denn(int n)
{
	int i;
	int tong=0;
	
	for(i=0;i<=n;i++)
	tong=tong+i;
	
	return tong;
}
int main()
{
	int n;
	
	printf("Nhap vao n: ");
	scanf("%d",&n);
	
	int kq=denn(n);
	
	printf("Tong tu 0 den %d la: %d",n,kq);
	
	return 0;
}
