#include <stdio.h>

int tinhtong(int a,int b)
{
	int tong;
	tong = a + b;
	return tong;
}
int main()
{
	int kq;
	kq=tinhtong(6,8);
	
	printf("Tong = %d",kq);
	
	return 0;
}
