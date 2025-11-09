#include <stdio.h>

void mot()
{
	char tensp[30];
	char masp[30];
	double gianhap;
	
	printf("Nhap vao ten san pham: ");
	fgets(tensp,30,stdin);
	
	printf("Nhap vao ma san pham: ");
	fgets(masp,30,stdin);
	
	printf("Nhap vao gia nhap cua san pham: ");
	scanf("%lf",&gianhap);
	getchar();
	
	double giaban = gianhap + (gianhap * 0.15);
	
	printf("\nTen cua san pham la: %s",tensp);
	printf("Ma cua san pham la: %s",masp);
	printf("Gia ban cua san pham la: %.1lf",giaban);
}

int hai(int n)
{
	int i;
	int tong=0;
	
	for(i=1;i<=n;i++)
	{
		if(i%3==0)
		tong=tong+i;
	}
	
	if(n%5==0)
	printf("\n%d la so co chia het cho 5.",n);
	else
	printf("\n%d la so khong chia het cho 5.",n);
	
	printf("\n\nTong cac so chia het cho 3 trong khoang tu 1 den %d la: %d",n,tong);
}

void ba()
{
	int n,i;
	int mang[n];
	
	printf("Nhap so luong sach: ");
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
	{
		printf("Nhap gia cua quyen sach so %d: ",i+1);
		scanf("%d",&mang[i]);
	}
	
	printf("\nSo luong sach co trong cua hang la %d quyen.",n);
	
	float max = mang[0];
	int vitri;2
	
	for(i=1;i<n;i++)
	{
		if(mang[i]>max)
		max=mang[i];
		vitri=i;
	}
	


	printf("\n\nQuyen sach so %d dat nhat voi gia: %.1f",vitri,max);
	
	int dem12k=0;
	
	for(i=0;i<n;i++)
	{
		if(mang[i]>12000)
		dem12k++;
	}
	
	printf("\n\nCo %d quyen sach co gia ban tren 12000.",dem12k);
}
int main()
{
	int menu;
	do
	{
		printf("\n\nMENU\n");
		
		printf("\n1. Thong tin san pham.");
		printf("\n2. Tinh tong cac so chia het cho 3.");
		printf("\n3. Thong tin sach.");
		
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
				
				printf("Nhap so nguyen duong N: ");
				scanf("%d",&n);
				
				if(n>0)
				hai(n);
				
				else
				printf("So ban vua nhap khong phai so nguyen duong!.");
				
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
				printf("\nBan chon sai chuc nang roi!.");
				
				break;
			}
		}//sw
	}//do
	while(menu!=0);
	return 0;
}//main
