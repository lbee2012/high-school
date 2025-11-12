#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void nguyenduong()
{
	int so;
	printf("Nhap vao so can kiem tra: ");
	scanf("%d",&so);
	
	if(so > 0)
		printf("%d la so nguyen duong.",so);
	else if(so == 0)
		printf("%d la so 0.",so);
	else
		printf("%d la so nguyen am.",so);
		
	return 0;
}
void chanle()
{
	int so;
	printf("Nhap vao so can kiem tra: ");
	scanf("%d",&so);
	
	if(so % 2 == 0)
		printf("%d la so chan.",so);
	else
		printf("%d la so le.",so);

	return 0;
}
void thtt()
{
	float tong,hieu,tich,thuong;
	float a,b;
	printf("Mieu ta chuc nang: tinh tong, hieu, tich, thuong cua 2 so a va b.\n");
	
	printf("Nhap vao a: ");
	scanf("%f",&a);
	printf("Nhap vao b: ");
	scanf("%f",&b);
	
	tong = a + b;
	hieu = a - b;
	tich = a * b;
	thuong = a / b;
	
	printf("Tong cua a va b la: %.2f\n",tong);
	printf("Hieu cua a va b la: %.2f\n",hieu);
	printf("Tich cua a va b la: %.2f\n",tich);
	printf("Thuong cua a va b la: %.2f\n",thuong);
	
	return 0;
}
void tuoi()
{
	int sn,tuoi;
	printf("Nhap vao nam sinh cua ban: ");
	scanf("%d",&sn);
	
	tuoi = 2023 - sn;
	
	printf("Ban nam nay %d tuoi.",tuoi);
	
	return 0;
}
void dtb()
{
	float t,l,h,dtb;
	
	printf("Mieu ta chuc nang: nhap vao diem toan, ly, hoa, tinh diem trung binh 3 mon.\n");
	
	printf("Nhap diem toan: ");
	scanf("%f",&t);
	printf("Nhap diem ly: ");
	scanf("%f",&l);
	printf("Nhap diem hoa: ");
	scanf("%f",&h);
	
	dtb = (t + l + h)/3;
	
	if(dtb <= 10 && dtb >= 9)
		printf("Hoc sinh xuat sac!");
	else if(dtb < 9 && dtb >= 8)
		printf("Hoc sinh gioi!");
	else if(dtb < 8 && dtb >= 6)
		printf("Hoc sinh kha!");
	else if(dtb < 8 && dtb >= 6)
		printf("Hoc sinh kha!");
	else if(dtb < 6 && dtb >= 5)
		printf("Hoc sinh trung binh!");
	else if(dtb < 5 && dtb >= 0)
		printf("Hoc sinh yeu!");
	else
		printf("Ban la robot a`?");
	
	
	return 0;
}
int main()
{
	int x;
	
	printf("=== MENU ===\n\n");
	
	printf("1. Kiem tra so co nguyen duong hay khong.\n");
	printf("2. Kiem tra so chan hay le.\n");
	printf("3. Nhap vao 2 so tinh tong, hieu, tich, thuong.\n");
	printf("4. Tinh tuoi cua ban.\n");
	printf("5. Tinh diem trung binh.\n");
	
	printf("0. Thoat MENU.\n\n");
	
	printf("Moi ban chon chuc nang: ");
	scanf("%d",&x);
	
	switch(x)
	{
		case 0:
			break;
		
		case 1:
		{
			printf("\nBan da chon ham kiem tra so nguyen duong.\n\n");
			nguyenduong();
			break;
		}
		
		case 2:
		{
			printf("\nBan da chon ham kiem tra so chan le.\n\n");
			chanle();
			break;
		}
		
		case 3:
		{
			printf("\nBan da chon ham tinh tong, hieu, tich, thuong.\n\n");
			thtt();
			break;
		}
		
		case 4:
		{
			printf("\nBan da chon ham tinh nam sinh, tuoi.\n\n");
			tuoi();
			break;
		}
		
		case 5:
		{
			printf("\nBan da chon ham tinh diem trung binh.\n\n");
			dtb();
			break;
		}
		
		default:
		{
			printf("\nBan la robot?");
			break;
		}
		
	}
	
	
	
	
	
	
	
	
	return 0;
}
