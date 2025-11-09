#include <stdio.h>

int nhuan(int n)
{
	if((n % 4 == 0) && (n % 100 != 0) || (n % 400 == 0))
	return 1;
	else
	return 0;
}
int main()
{
	int nam;
	
	printf("Nhap nam: ");
	scanf("%d",&nam);
	
	if(nhuan(nam)==1)
	printf("Nam %d la nam nhuan.",nam);
	
	else
	printf("Nam %d la nam khong nhuan.",nam);
	
	return 0;
}
