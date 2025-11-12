#include <stdio.h>

int chanle(int x)
{
	if(x%2==0) return 1;
	else return 0;
}
int main()
{
	int n;
	
	printf("Nhap n: ");
	scanf("%d",&n);
	
	if(chanle(n)==1)
	printf("So %d la so chan.",n);
	
	else
	printf("So %d la so le.",n);
	return 0;
}
