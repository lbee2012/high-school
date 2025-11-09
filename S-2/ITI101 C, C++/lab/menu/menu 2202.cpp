#include <stdio.h>

int mot(int n)
{
	int i;
	int tong = 0;
	
	printf("\nCac so chan tu 1 den %d la: ",n);
	
	for(i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			printf("%d ",i);
			tong=tong+i;
		}
	}
	printf("\n\nTong cac so chan tu 1 den %d la: %d",n,tong);
}

int hai(int a, int b, int c, int d)
{
	int max = a;
	
	if(b > max)
	max = b;
	if(c > max)
	max = c;
	if(d > max)
	max = d;
	
	printf("\nSo lon nhat trong 4 so %d, %d, %d, %d la: %d",a,b,c,d,max);
}

void ba()
{
	char ten[30];
	int tuoi;
	char diachi[30];
	char tpho[30];
	
	printf("Nhap vao ho va ten cua ban: ");
	fgets(ten,30,stdin);
	
	printf("Nhap vao tuoi hien tai cua ban: ");
	scanf("%d",&tuoi);
	getchar();
	
	printf("Nhap vao dia chi nha cua ban: ");
	fgets(diachi,30,stdin);
	
	printf("Nhap vao ten thanh pho ban dang song: ");
	fgets(tpho,30,stdin);
	
	printf("\nHo ten cua ban la: %s",ten);
	printf("Ban hien tai dang %d tuoi",tuoi);
	printf("\nDia chi nha cua ban o: %s",diachi);
	printf("Ban dang song o thanh pho %s",tpho);
}

void bon()
{
	int soluong;
	
	printf("Nhap vao so luong suc vat: ");
	scanf("%d",&soluong);
	
	float cannang[soluong];
	
	int i;
	
	for(i=0;i<soluong;i++)//for nhaapj caan nangwj
	{
		printf("Can nang cua suc vat %d la: ",i+1);
		scanf("%f",&cannang[i]);
	}
	
	printf("\nCan nang vua nhap la:");
	
	for(i=0;i<soluong;i++)
	{
		printf("\nSuc vat %d: %.1f",i+1,cannang[i]);
	}
}

int main()
{
	int menu;
	
	do
	{
	printf("\n\nMENU\n");
	
	printf("\n1. Tong tu 1 den N.");
	printf("\n2. Tim max cua 4 so.");
	printf("\n3. Thong tin ca nhan.");
	printf("\n4. Tong tu 1 den N.");
	
	printf("\n\n0. Thoat MENU.");
	
	printf("\n\nNhap vao phim chuc nang: ");
	scanf("%d",&menu);
	getchar();
	
	switch(menu)
	{
		case 1:
		{
			printf("\nChuc nang 1.\n\n");
			
			int n;
			
			printf("Nhap vao so N: ");
			scanf("%d",&n);
			
			int trl = mot(n);
			
			break;
		}
		case 2:
		{
			printf("\nChuc nang 2.\n\n");
			
			int a,b,c,d;
			
			printf("Nhap vao so thu nhat: ");
			scanf("%d",&a);
			
			printf("Nhap vao so thu hai: ");
			scanf("%d",&b);
			
			printf("Nhap vao so thu ba: ");
			scanf("%d",&c);
			
			printf("Nhap vao so thu bon: ");
			scanf("%d",&d);
			
			int trl = hai(a,b,c,d);
			
			break;
		}
		case 3:
		{
			printf("\nChuc nang 3.\n\n");
			
			ba();
			
			break;
		}
		case 4:
		{
			printf("\nChuc nang 4.\n\n");
			
			bon();
			
			break; 
		}
		case 0:
		{
			printf("\nThoat MENU thanh cong!.");
			break;
		}
		default:
		{
			printf("\nBan chon ngu!.");
			break;
		}
	}//sw
	}//do
	while(menu!=0);
	return 0;
}//main
