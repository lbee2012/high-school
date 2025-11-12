#include <stdio.h>

int main()
{
	char masp[30];
	char tensp[30];
	float gia;
	
	printf("Ma sp: ");
	fgets(masp,30,stdin);
	
	printf("Ten sp: ");
	fgets(tensp,30,stdin);
	
	printf("Gia thanh sp: ");
	scanf("%f",&gia);
	getchar();
	
	printf("\nMa sp la: %s",masp);
	printf("Ten sp la: %s",tensp);
	printf("Gia thanh cua sp la: %.2f\n",gia);
	
	return 0;
}
