#include <stdio.h>
#include <math.h>

int main()
{
	int x;
	
	printf("Nhap vao x: ");
	scanf("%d",&x);
	
	if(x % 5 == 0)
	printf("%d chia het cho 5",x);
	
	else
	printf("%d deo chia het cho 5",x);
	
	
	
	return 0;
}
