#include <stdio.h>
void tuoi()
{
	int ns,tuoi;
	
	printf("Nhap vao nam sinh cua ban: ");
	scanf("%d",&ns);
	
	tuoi = 2024 - ns;
	
	if(ns<2024)
		printf("Nam nay ban %d tuoi.",tuoi);
	else if(ns==2024)
		printf("Ban 0 co tuoi !?");
	else
		printf("Ban chua duoc sinh ra.");
}
void thtt()
{
	float a,b,tong,hieu,tich,thuong;
	
	printf("Nhap vao a: ");
	scanf("%f",&a);
	
	printf("Nhap vao b: ");
	scanf("%f",&b);
	
	tong = a + b;
	hieu = a - b;
	tich = a * b;
	thuong = a / b;
	
	printf("Tong cua %.0f + %.0f = %.0f\n",a,b,tong);
	printf("Hieu cua %.0f - %.0f = %.0f\n",a,b,hieu);
	printf("Tich cua %.0f * %.0f = %.0f\n",a,b,tich);
	printf("Thuong cua %.0f / %.0f = %f\n",a,b,thuong);
}
void chanle()
{
	int x;
	
	printf("Nhap vao x: ");
	scanf("%d",&x);

	if(x%2==0)
	printf("%d la so chan.",x);
	
	else
	printf("%d la so le.",x);
}
void mua()
{
	int thang;
	printf("Nhap thang: ");
	scanf("%d",&thang);
	
	switch (thang)
	{
	case 1:
	case 2:
	case 3:
		printf("\nThang %d thuoc mua xuan.",thang);
		break;
		
	case 4:
	case 5:
	case 6:
		printf("\nThang %d thuoc mua he.",thang);
		break;
		
	case 7:
	case 8:
	case 9:
		printf("\nThang %d thuoc mua thu.",thang);
		break;
		
	case 10:
	case 11:
	case 12:
		printf("\nThang %d thuoc mua dong.",thang);
		break;
		
	default:
		printf("Nhap sai thang (1-12).");
		break;
	}
}
int main()
{
	int menu;
	
	printf("=== MENU ===\n\n");
	
	printf("1. Tinh tuoi.\n");
	printf("2. Tinh tong, hieu, tich, thuong cua hai so.\n");
	printf("3. Kiem tra so chan hay le.\n");
	printf("4. Kiem tra thang thuoc mua nao trong nam.\n");
	
	printf("0. Thoat MENU\n\n");
	
	printf("Lua chon cua ban la: ");
	scanf("%d",&menu);
	
	switch (menu)
	{
		case 0:
		{
			printf("\nThoat MENU thanh cong.");
			break;
		}
		case 1:
		{
			printf("\nBan da chon ham: Tinh tuoi.\n\n");
			tuoi();
			break;
		}
		case 2:
		{
			printf("\nBan da chon ham: Tinh tong, hieu, tich, thuong cua hai so.\n\n");
			thtt();
			break;
		}
		case 3:
		{
			printf("\nBan da chon ham: Kiem tra so chan hay le.\n\n");
			chanle();
			break;
		}
		case 4:
		{
			printf("\nBan da chon ham: Kiem tra thang thuoc mua nao trong nam.\n\n");
			mua();
			break;
		}

	}
}
