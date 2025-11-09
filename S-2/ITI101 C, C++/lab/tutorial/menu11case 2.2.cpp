#include <stdio.h>
void mot()
{
	int n,i;
	float tich=1;
	
	do
	{
		printf("Nhap vao n (+): ");
		scanf("%d",&n);
	
		if(n<=0)
		printf("\nN phai la so nguyen duong.\n\n");
	}//do
	while(n<=0);
	
	for(i=1;i<=n;i++)
	tich=tich*i;
	
	printf("\nTich tu 1 den %d la: %.0f",n,tich);
}
void hai()
{
	int a,b;
	
	int tong;
	int hieu;
	float tich;
	float thuong;
	
	printf("Nhap vao so a: ");
	scanf("%d",&a);
	
	printf("Nhap vao so b: ");
	scanf("%d",&b);
	
	tong=a+b;
	hieu=a-b;
	tich=(float)a*(float)b;
	thuong=(float)a/(float)b;
	
	printf("\nTong cua %d va %d la: %d.",a,b,tong);
	printf("\nHieu cua %d va %d la: %d.",a,b,hieu);
	printf("\nTich cua %d va %d la: %.0f.",a,b,tich);
	printf("\nThuong cua %d va %d la: %.2f.",a,b,thuong);
}
void ba()
{
	int thang;
	
	printf("Nhap vao thang (so): ");
	scanf("%d",&thang);
	
	switch(thang)
	{
		case 1:
		{
			printf("Thang mot.");
			break;
		}
		case 2:
		{
			printf("Thang hai.");
			break;
		}
		case 3:
		{
			printf("Thang ba.");
			break;
		}
		case 4:
		{
			printf("Thang bon.");
			break;
		}
		case 5:
		{
			printf("Thang nam.");
			break;
		}
		case 6:
		{
			printf("Thang sau.");
			break;
		}
		case 7:
		{
			printf("Thang bay.");
			break;
		}
		case 8:
		{
			printf("Thang tam.");
			break;
		}
		case 9:
		{
			printf("Thang chin.");
			break;
		}
		case 10:
		{
			printf("Thang muoi.");
			break;
		}
		case 11:
		{
			printf("Thang muoi mot.");
			break;
		}
		case 12:
		{
			printf("\nThang muoi hai.");
			break;
		}
		default:
		{
			printf("\nNhap sai so thang.");
			break;
		}
	}//sw
}//void
void bon()
{
	
}
void nam()
{
	int thang;
	
	printf("Nhap vao thang: ");
	scanf("%d",&thang);
	
	switch(thang)
	{
		case 1:
		case 2:
		case 3:
			printf("Thang %d thuoc quy 1.",thang);
			break;
			
		case 4:
		case 5:
		case 6:
			printf("Thang %d thuoc quy 2.",thang);
			break;
			
		case 7:
		case 8:
		case 9:
			printf("Thang %d thuoc quy 3.",thang);
			break;
			
		case 10:
		case 11:
		case 12:
			printf("Thang %d thuoc quy 4.",thang);
			break;
	}//sw
}//void
void sau()
{
	int nam,thang;
	
	printf("Nhap thang: ");
	scanf("%d",&thang);
	
	switch (thang)
	{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			printf("Thang %d co 31 ngay.",thang);
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			printf("Thang %d co 30 ngay.",thang);
			break;
			
		case 2:
		{		
			printf("Nhap nam: ");
			scanf("%d",&nam);
	
			if((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0))
			{
			printf("Thang 2 nam %d co 29 ngay.",nam);
			break;
			}
			else
			{
			printf("Thang 2 nam %d co 28 ngay.",nam);
			break;
			}
		}
		default:
		{
			printf("Nhap sai thang.");
			break;
		}
	}//sw
}//void
void bay()
{
	
}
void tam()
{
	
}
void chin()
{
	int n,i;
	float tich=1;
	
	do
	{
		printf("Nhap vao n (le,|3): ");
		scanf("%d",&n);
		
		if(n%3!=0 || n%2==0)
		printf("\nNhap lai N.\n\n");
	}//do
	while(n%3!=0 || n%2==0);
	
	for(i=1;i<=n;i+=2)
	
	if(i%3==0)
	tich=tich*i;
	
	printf("\nTich cac so le chia het cho 3 tu 1 den %d la: %.0f",n,tich);
}
void muoi()
{
	
}
void motmot()
{
	int n,i;
	
	printf("Nhap vao n(|2,|3): ");
	scanf("%d",&n);
	
	for(i=0;i<=n;i++)
	{
		if(i%2==0 && i%3==0)
		printf("%d\n",i);
	}
}

int main()
{
	int menu;
	printf("\n\nMENU\n\n");
	
	printf("1. Tinh tich tu 1 den N.\n");
	printf("2. Tinh tong hieu tich thuong.\n");
	printf("3. Thang trong nam.\n");
	printf("4. Kiem tra 3 so duong la tam giac gi.\n");
	printf("5. Thang thuoc quy.\n");
	printf("6. Thang bnh ngay.\n");
	printf("7. \n");
	printf("8. \n");
	printf("9. Tich cac so le chia het cho 3 tu 1 den N.\n");
	printf("10. \n");
	printf("11. Cac so chia het cho 2,3 tu 0 den N.\n");
	
	printf("\n\n0. Thoat MENU");
	do
	{
	printf("\n\n\nNhap vao phim chuc nang: ");
	scanf("%d",&menu);
	
	switch(menu)
	{
		case 1:
		{
			printf("\nNhap N den khi nhap vao so duong.\n");
			printf("Tinh tich cac so tu 1 den N.\n\n");
			mot();
			break;
		}
		case 2:
		{
			printf("\nTinh tong hieu tich thuong cua 2 so nguyen nhap vao.\n\n");
			hai();
			break;
		}
		case 3:
		{
			printf("\nNhap vao 1 so, kiem tra so do tuong ung la thang nao trong nam.\n\n");
			ba();
			break;
		}
		case 4:
		{
			printf("\nNhap 3 so duong, nhap di nhap lai den khi du 3 so duong.\n");
			printf("Kiem tra 3 so do co hop thanh tam giac khong, neu co thi la tam giac gi.\n\n");
			bon();
			break;
		}
		case 5:
		{
			printf("\nNhap vao mot thang, kiem tra thang thuoc quy nao trong nam.\n\n");
			nam();
			break;
		}
		case 6:
		{
			printf("\nNhap vao mot thang, kiem tra thang do co bao nhieu ngay.\n\n");
			sau();
			break;
		}
		case 7:
		{
			printf("\n.\n\n");
			
			break;
		}
		case 8:
		{
			printf("\n.\n\n");
			
			break;
		}
		case 9:
		{
			printf("\nTinh tich cac so le chia het cho 3 tu 1 den N.\n\n");
			chin();
			break;
		}
		case 10:
		{
			printf("\n.\n\n");
			
			break;
		}
		case 11:
		{
			printf("\nIn ra cac so chan chia het cho 2,3 trong khoang 0 den N.\n\n");
			motmot();
			break;
		}
		case 0:
		{
			printf("\nThoat MENU thanh cong.");
			break;
		}
		default:
		{
			printf("\nNhap sai phim chuc nang, moi nhap lai.\n\n");
		}
	}//sw
	}//do
	while(menu!=0);
	
	return 0;
}//main
