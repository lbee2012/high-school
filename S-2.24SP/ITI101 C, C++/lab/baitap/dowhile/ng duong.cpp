#include <stdio.h>

int main()
{
	int x;
	
	do
	{
		printf("Nhap vao diem: ");
		scanf("%d",&x);
	}
	
	while (x%2!=0);
	printf("Diem cua ban la: %d",x);
	
	return 0;
}
