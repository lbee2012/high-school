#include <stdio.h>

int tichdenn(int n)
{
	int tong=1;
	
	for(int i=1;i<=n;i++)
	{
		if(i%2==1)
		tong=tong*i;
	}
	return tong;
}
int main()
{
	int n;
	
	printf("Nhap vao n: ");
	scanf("%d",&n);
	
	int kq=tichdenn(n);
	
	printf("Tich cac so le tu 1 den %d la: %d",n,kq);
	
	return 0;
}
