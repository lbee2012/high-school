#include<stdio.h>
int main()
{

	float dtb;
	
	printf("Nhap vao dtb: ");
	scanf("%f",&dtb);
	
	if(dtb<=10 && dtb>= 9)
	printf("Hoc luc xuat sac");
	
	else if(dtb>=8)
	printf("Hoc luc gioi");
	
	else if(dtb>=6.5)
	printf("Hoc luc kha");

	else if(dtb>=5)
	printf("Hoc luc trung binh");
	
	else if(dtb>=3.5)
	printf("Hoc luc yeu");
	
	else
	printf("Hoc luc kem");
	
	return 0;
	
}
	
