#include <stdio.h>
void tbc()
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
}
void ngto()
{
	int x,i;
	
	printf("Nhap vao so X can ktra: ");
	scanf("%d",&x);
	
	int biendem = 0;
	
	for(i=2;i<x;i++)
	
	if(x%i==0)
		biendem++;
		
	if(biendem==0)
		printf("X chinh la so nguyen to.");
	else
		printf("X deo phai so nguyen to.");
}
void cphg()
{
	int x,i;
	int biendem = 0;
	
	printf("Nhap vao so X can ktra: ");
	scanf("%d",&x);
	
	for(i=1;i<x;i++)
	
	if(i*i==x)
		biendem++;
	if(biendem==0)
		printf("X khong phai so chinh phuong.");
	else
		printf("X chinh la so chinh phuong.");
}
int main()
{
	int x;
	
	printf("+---------------------------------------+\n");
	printf("|Chuc nang 1: Tinh trung binh tong      |\n");
	printf("|Chuc nang 2: Tim so nguyen to          |\n");
	printf("|Chuc nang 3: Tim so chinh phuong       |\n");
	printf("|Chuc nang 4: Thoat                     |\n");
	printf("+---------------------------------------+\n\n");
	
	printf("Xin moi chon chuc nang (1,2,3,4): ");
	
	scanf("%d",&x);
	
	switch(x)
	{
		case 1:
		{
			printf("Ban da chon chuc nang 1.\n");
			tbc();
			break;
		}
		case 2:
		{
			printf("Ban da chon chuc nang 2.\n");
			ngto();
			break;
		}
		case 3:
		{
			printf("Ban da chon chuc nang 3.\n");
			cphg();
			break;
		}
		case 4:
		{
			printf("Thoat MENU.");
			break;
		}
		default:
		{
			printf("Ban chon ngu.");
			break;
		}
	}
	
	
	return 0;
}
