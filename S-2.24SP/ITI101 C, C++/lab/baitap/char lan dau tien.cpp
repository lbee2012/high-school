#include <stdio.h>

int main()
{
	char a[100];
	char b[100];
	printf("Nhap ho ten cua ban: ");
	gets(a);
	printf("Nhap dia chi nha cua ban: ");
	gets(b);
	printf("\nHo ten ban la: %s",a);
	printf("\nDia chi nha ban la: %s",b);
	
	return 0;
}
