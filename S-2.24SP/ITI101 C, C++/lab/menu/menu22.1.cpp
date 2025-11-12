#include <stdio.h>
void mot()
{
	int a,b,tong;
	
	printf("Nhap vao a: ");
	scanf("%d",&a);
	
	printf("Nhap vao b: ");
	scanf("%d",&b);
	
	tong=a+b;
	
	printf("\nTong cua %d + %d la: %d",a,b,tong);
}
void hai()
{
	int thang;
	
	printf("Nhap vao thang: ");
	scanf("%d",&thang);
	
	switch (thang)
	{
		case 1:
		case 2:
		case 3:
			printf("\nThang %d thuoc quy 1.",thang);
			break;
		case 4:
		case 5:
		case 6:
			printf("\nThang %d thuoc quy 2.",thang);
			break;
		case 7:
		case 8:
		case 9:
			printf("\nThang %d thuoc quy 3.",thang);
			break;
		case 10:
		case 11:
		case 12:
			printf("\nThang %d thuoc quy 4.",thang);
			break;
			
		default:
			printf("\nBan nhap ngu, 1 nam chi co 12 thang.");
			break;
	}
}
void ba()
{
	int min,max,i;
	
	printf("Nhap vao min: ");
	scanf("%d",&min);
	
	printf("Nhap vao max: ");
	scanf("%d",&max);
	
	for(i=min;i<=max;i++)
	
	if(i%2==0)
	printf("%d\n",i);
}
void bon()
{
	int n,i;
	int tong=0;
	
	printf("Nhap n: ");
	scanf("%d",&n);
	
	for(i=0;i<=n;i++)
	{
	tong=tong+i;
	}
	printf("%d\n",tong);
}
int main()
{
	int menu;
	
	do
	{
	printf("\n\nMENU\n\n");
	
	printf("Chuc nang 1: Tinh tong so nguyen a va b.\n");
	printf("Chuc nang 2: Nhap vao thang trong nam. In ra thang thuoc quy nao.\n");
	printf("Chuc nang 3: Nhap vao 2 so nguyen min,max. In ra cac so chan.\n");
	printf("Chuc nang 4: Nhap vao so nguyen n. Tinh tong cac so tu 0 den n.\n\n");
	
	printf("Chuc nang 5: Thoat MENU\n\n");
	
	printf("Moi ban chon chuc nang (1,2,3,4,5): ");
	
	scanf("%d",&menu);
	
	switch (menu)
	{
		case 1:
		{
			printf("\nBan da chon chuc nang 1: Tinh tong so nguyen a va b.\n\n");
			mot();
			break;
		}
		case 2:
		{
			printf("\nBan da chon chuc nang 2: Tinh thang thuoc quy nao trong nam.\n\n");
			hai();
			break;
		}
		case 3:
		{
			printf("\nBan da chon chuc nang 3: In ra cac so chan tu min den max.\n\n");
			ba();
			break;
		}
		case 4:
		{
			printf("\nBan da chon chuc nang 4: Tinh tong cac so tu 0 den n.\n\n");
			bon();
			break;
		}
		case 5:
		{
			printf("\nThoat MENU thanh cong.");
			break;
		}
		default:
		{
			printf("\nBan vua chon ngu!");
		}
	}
	}
	while(menu!=5);
	
	return 0;
}
