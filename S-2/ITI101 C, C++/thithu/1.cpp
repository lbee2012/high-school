#include <stdio.h>

void mot()
{
	char ten[30];
	int tuoi;
	char diachi[30];
	int ky;
	char nganh[30];
	
	printf("Ten cua ban la gi: ");
	fgets(ten,30,stdin);
	
	printf("Ban dang bao nhieu tuoi: ");
	scanf("%d",&tuoi);
	getchar();
	
	printf("Dia chi nha cua ban o dau: ");
	fgets(diachi,30,stdin);
	
	printf("Ban dang hoc o ky hoc so may: ");
	scanf("%d",&ky);
	getchar();
	
	printf("Ban hoc chuyen nganh nao: ");
	fgets(nganh,30,stdin);
	
	printf("\nBan ten la: %s",ten);
	printf("Ban %d tuoi",tuoi);
	printf("\nDia chi nha cua ban o %s",diachi);
	printf("Ban dang trong ky hoc so %d",ky);
	printf("\nBan hoc chuyen nganh %s",nganh);
}

int hai(int n)
{
	int i;
	int tong=0;
	
	for(i=1;i<=n;i++)
	{
		tong=tong+i;
	}
	
	printf("\nTong cac so tu 1 den %d la: %d",n,tong);
}

void ba()
{
	printf("-----Thong tin sinh vien-----\n");
	
	int n,i;
	int mang[n];
	
	printf("\nNhap tong so lop: ");
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
	{
		printf("Nhap so sinh vien co trong lop so %d: ",i+1);
		scanf("%d",&mang[i]);
	}
	
	printf("\n-----Xuat thong tin sinh vien-----\n");
	
	for(i=0;i<n;i++)
	{
		printf("\nLop so %d co %d sinh vien.",i+1,mang[i]);
	}
	
	printf("\n\nCac lop co so luong sinh vien nho hon 30 la: ");
	
	for(i=0;i<n;i++)
	{
		if(mang[i]<30)
		printf("%d ",i+1);
	}
	
	int min = mang[0];
	int vitri;
	
	for(i=0;i<n;i++)
	{
		if(mang[i]<min)
		min=mang[i];
		vitri=i;
	}
	
	printf("\n\nLop co so sv it nhat la lop so %d voi %d sv",vitri,min);
}

int main()
{
	int menu;
	do
	{
		printf("\n\n+---------------Menu---------------+");
		
		printf("\n|1. Thong tin ca nhan.             |");
		printf("\n|2. Tinh tong.                     |");
		printf("\n|3. Thong tin sinh vien cac lop.   |");
		
		printf("\n|0. Thoat MENU.                    |");
		printf("\n+----------------------------------+");
		
		printf("\n\nMoi chon chuc nang: ");
		scanf("%d",&menu);
		getchar();
		
		switch(menu)
		{
			case 1:
			{
				printf("\nChuc nang so 1.\n\n");
				
				mot();
				
				break;
			}
			case 2:
			{
				printf("\nChuc nang so 2.\n\n");
				
				int n;
				
				printf("Nhap so nguyen N: ");
				scanf("%d",&n);
				
				if(n>0)
				hai(n);
				
				else
				printf("So vua nhap khong phai so nguyen duong.");
				
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
				printf("\nBan chon sai chuc nang!.");
				break;
			}
		}//sw
	}//do
	while(menu!=0);
}//main
