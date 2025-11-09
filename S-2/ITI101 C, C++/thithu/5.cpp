#include <stdio.h>

void mot()
{
	char ten[30];
	int tuoi;
	
	printf("Nhap vao ten cua ban: ");
	fgets(ten,30,stdin);
	
	printf("Nhap vao tuoi cua ban: ");
	scanf("%d",&tuoi);
	getchar();
	
	printf("Ban ten la %s",ten);
	printf("Ban %d tuoi",tuoi);
}

int hai(int n)
{
	int i;
	int tong=0;
	int biendem=0;
		
	for(i=1;i<=n;i++)
	{
		if(i%4==0)
		biendem++;
		
		if(i%4==0 || i%5==0)
		tong=tong+i;
	}
	
	printf("\nCo %d so chia het cho 4.",biendem);
	printf("\n\nTong cac so chia het cho 4 hoac chia het cho 5 trong khoang tu 1 den %d la: %d",n,tong);
}

void ba()
{
	int n,i;
	
	printf("Nhap so doan duong can xay dung: ");
	scanf("%d",&n);
	
	float mang[n];
	
	float tong=0;
	
	for(i=0;i<n;i++)
	{
		printf("Nhap do dai cua doan duong so %d: ",i+1);
		scanf("%f",&mang[i]);
		
		tong=tong+mang[i];
	}
	
	for(i=0;i<n;i++)
	{
		printf("\nDoan duong so %d dai: ",i+1);
		printf("%.1fm ",mang[i]);
	}
	
	
	printf("\n\nCac doan duong co do dai lon hon 100 la: ");
	
	for(i=0;i<n;i++)
	if(mang[i]>100)
	printf("%d ",i+1);
	
	float tbc = tong / n;
	
	printf("\n\nTrung binh cong do dai cac doan duong la: %.3fm",tbc);

}
int main()
{
	int menu;
	do
	{
		printf("\n\nMENU\n");
		
		printf("\n1. Thong tin ban than.");
		printf("\n2. So chia het cho 4.");
		printf("\n3. Thong tin cac doan duong.");
		
		printf("\n\n0. Thoat MENU.");
		
		printf("\n\nMoi chon chuc nang: ");
		scanf("%d",&menu);
		getchar();
		
		switch(menu)
		{
			case 1:
			{
				printf("\nChuc nang 1.\n\n");
				
				mot();
				
				break;
			}
			case 2:
			{
				printf("\nChuc nang 2.\n\n");
				
				int n;
				
				printf("Nhap vao so nguyen duong N: ");
				scanf("%d",&n);
				
				hai(n);
				
				break;
			}
			case 3:
			{
				printf("\nChuc nang 3.\n\n");
				
				ba();
				
				break;
			}
			case 0:
			{
				printf("\nThoat MENU thanh cong!.");
				break;
			}
			default:
			{
				printf("\nBan chon ng!.");
			}
		}//sw
	}//do
	while (menu!=0);
	return 0;
}//main
