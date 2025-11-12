#include <stdio.h>

void mot()
{
	char ten[30];
	int tuoi;
	float can;
	float cao;
	
	printf("Nhap ten cua nguoi yeu cu: ");
	fgets(ten,30,stdin);
	
	printf("Nhap tuoi cua nguoi yeu cu: ");
	scanf("%d",&tuoi);
	
	printf("Nhap can nang cua nguoi yeu cu (kg): ");
	scanf("%f",&can);
	
	printf("Nhap chieu cao cua nguoi yeu cu (cm): ");
	scanf("%f",&cao);
	
	printf("\nNguoi yeu cu ban ten la: %s",ten);
	printf("Nguoi yeu cu ban %d tuoi",tuoi);
	printf("\nNguoi yeu cu ban nang %.1fkg",can);
	printf("\nNguoi yeu cu ban cao %.1fcm",cao);
}

int hai(int n)
{
	int i;
	
	printf("\nCac so se trong khoang tu 1 den %d la: ",n);
	for(i=1;i<=n;i++)
	{
		if(i%2!=0)
		printf("%d ",i);
	}
	
	int demchan=0;
	for(i=0;i<=n;i++)
	{
		if(i%2==0)
		demchan++;
	}
	printf("\n\nCo %d so chan trong khoang tu 0 den %d",demchan,n);
}

void ba()
{
	int n,i;
	
	printf("+-----Thong tin sinh vien thi Lap Trinh-----+");
	
	printf("\n\nMoi nhap so luong diem sinh vien: ");
	scanf("%d",&n);
	
	int mang[n];
	
	float tong = 0;
	float dtb;
	
	for(i=0;i<n;i++)
	{
		printf("Diem thi so %d la: ",i+1);
		scanf("%d",&mang[i]);
		
		tong = tong + mang[i];
	}
	
	printf("\n+-----Xuat thong tin sinh vien-----+");
	
	dtb = tong / n;
	printf("\n\nSo luong diem la: %d",n);
	
	printf("\nDiem trung binh la: %.2f",dtb);
	
	int max=mang[0];
	for(i=1;i<n;i++)
	{
		if(mang[i]>max)
		max=mang[i];
	}
	printf("\nDiem cao nhat cua sinh vien do la: %d",max);
}
int main()
{
	int menu;
	do
	{
		printf("\n\n+--------------------MENU--------------------+");
		printf("\n|1. Thong tin nguoi yeu cu.                  |");
		printf("\n|2. Tinh toan.                               |"); 
		printf("\n|3. Thong tin sinh vien thi Lap Trinh.       |");
		printf("\n|                                            |");
		printf("\n|0. Thoat.                                   |");
		printf("\n+--------------------------------------------+");
		
		printf("\n\nMoi chon chuc nang: ");
		scanf("%d",&menu);
		getchar();
		
		switch(menu)
		{
			case 1:
			{
				printf("\nChuc nang 1: Thong tin nguoi yeu cu.\n\n");
				
				mot();
				
				break;
			}
			case 2:
			{
				printf("\nChuc nang 2: Tinh toan.\n\n");
				
				int n;
				
				printf("Nhap vao so nguyen duong N: ");
				scanf("%d",&n);
				
				if(n>0)
				hai(n);
				
				else
				printf("So ban vua nhap khong phai so nguyen duong!.");
				
				break;
			}
			case 3:
			{
				printf("\nChuc nang 3: Thong tin sinh vien thi Lap Trinh.\n\n");
				
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
	return 0;
}//main
