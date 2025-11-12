#include <stdio.h>

int main()
{
	int min,max;
	
	printf("Nhap min: ");
	scanf("%d",&min);
	
	printf("Nhap max: ");
	scanf("%d",&max);
	
	float tong = 0;
	float biendem = 0;
	float tb = 0;
	
	while (min <= max)
	{
		tong=tong+min;
		biendem++;
		min++;
	}
	tb = tong/biendem;
	
	printf("Trung binh cong cac so tu min den max la: %f",tb);
	
	return 0;
}
