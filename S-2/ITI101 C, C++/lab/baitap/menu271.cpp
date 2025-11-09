#include <stdio.h>

int hai(int n)
{
	int i;
	int tong=0;
	
	for(i=1;i<=n;i++)
	
	tong=tong+i;
	
	return tong;
}
int main()
{
	int menu;
	do
	{
	printf("\n\n+------------------MENU------------------+\n");
	printf("|1: Thong tin ca nhan.                   |\n");
	printf("|2: Tinh tong tu 1 den N.                |\n");
	printf("|3: Tong cac so chia het cho 5 nho hon N.|\n");
	printf("|0: Thoat MENU.                          |\n");
	printf("+----------------------------------------+\n\n");
	
	printf("Nhap vao lua chon: ");
	scanf("%d",&menu);
	
	switch(menu)
	{
		case 1:
		{
			printf("\n1. Thong tin ca nhan.\n");
			
			break;
		}
		case 2:
		{
			printf("\n2. Tong tu 1 den N.\n\n");
			
			int n;
			int kq;
			
			printf("Nhap n: ");
			scanf("%d",&n);
			
			kq=hai(n);
			
			printf("\nTong tu 1 den n la: %d\n\n",kq);
			
			if(kq%2==0)
			printf("%d la so chan.",kq);
			else
			printf("%d la so le.",kq);
			
			break;
		}
		case 3:
		{
			printf("\n3. Tong cac so chia het cho 5 nho hon N.\n\n");
			
			break;
		}
		case 0:
		{
			printf("\nThoat MENU thanh cong!\n");
			
			break;
		}
		default:
		{
			printf("\nNhap sai...");
		}
	} //sw
	} //do
	while (menu!=0);
	return 0;
} //main
