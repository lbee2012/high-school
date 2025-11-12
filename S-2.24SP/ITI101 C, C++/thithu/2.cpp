#include <stdio.h>

void mot()
{
	char hoten[30];
	char mssv[30];
	float diem;
	
	printf("Nhap vao ho va ten cua ban: ");
	fgets(hoten,30,stdin);
	
	printf("Nhap vao ma so sinh vien cua ban: ");
	fgets(mssv,30,stdin);
	
	printf("Nhap vao diem cua ban: ");
	scanf("%f",&diem);
	
	printf("\nHo va ten cua ban la: %s",hoten);
	printf("Ma so sinh vien cua ban la: %s",mssv);
	printf("Diem cua ban la: %.2f",diem);
}

int hai(int n)
{
	int i;
	int tong = 0;
	
	
	for(i=1;i<=n;i++)
	{
		tong = tong + i;
	}
	printf("\nTong tu 1 den %d la: %d",n,tong);
	
	if(n % 2 == 0)
	printf("\n%d la so chan.",n);
	else
	printf("\n%d la so le.",n);
}

void ba()
{
	int soluongtivi;
	
	printf("Moi nhap so luong tivi: ");
	scanf("%d",&soluongtivi);
	
	
	float kichcotivi[soluongtivi];
	float kichcotrungbinh = 0;
	
	printf("\nNhap mang kich co cua tung tivi (inch).\n");
	for(int i = 0;i < soluongtivi;i++)
	{
		printf("Tivi so %d: ",i+1);
		scanf("%f",&kichcotivi[i]);
		
		kichcotrungbinh = kichcotrungbinh + kichcotivi[i];
	}
	kichcotrungbinh = kichcotrungbinh / soluongtivi;
	
	float kichcolonnhat = kichcotivi[0];
	int vitrilonnhat = 0;
	
	for(int i = 1;i < soluongtivi;i++)
	{
		if(kichcotivi[i] > kichcolonnhat)
		{
			kichcolonnhat = kichcotivi[i];
			vitrilonnhat = i;
		}
	}
	
	printf("\nSo luong tivi co trong cua hang la: %d",soluongtivi);
	printf("\nKich co trung binh cua tivi la: %.2finch",kichcotrungbinh);
	printf("\nVi tri tivi co kich co lon nhat la: %d",vitrilonnhat + 1);
}
int main()
{
	int menu;
	do
	{
		printf("\n\n+--------------------------Menu------------------------+\n");
		printf("|1. Thong tin ca nhan.                                 |\n");
		printf("|2. Tinh tong tu 1 den N.                              |\n");
		printf("|3. Thong tin Tivi.                                    |\n");
		printf("|0. Thoat.                                             |\n");
		printf("+------------------------------------------------------+");
		
		printf("\n\nMoi chon phim chuc nang: ");
		scanf("%d",&menu);
		getchar();
		
		switch(menu)
		{
			case 1:
			{
				printf("\nBan da chon chuc nang 1.\n");
				printf("Nhap vao ho ten, mssv, diem. In ra tat ca cac thong tin vua nhap.\n\n");
				
				mot();
				break;
			}
			case 2:
			{
				printf("\nBan da chon chuc nang 2.\n");
				printf("Nhap mot so nguyen bat ki, tinh tong tu 1 den N.\n");
				printf("In ra thong bao xem so vua nhap la so chan hay so le.\n\n");
				
				int n;
				
				printf("Moi nhap vao so nguyen N: ");
				scanf("%d",&n);
				
				int kq = hai(n);
				break;
			}
			case 3:
			{
				printf("\nBan da chon chuc nang 3.\n");
				printf("Nhap so luong tivi, nhap mang kich co cho tung tivi, xuat thong tin tivi...\n\n");
				
				ba();
				break;
			}
			case 0:
			{
				printf("\nThoat MENU thanh cong!");
				break;
			}
			default:
			{
				printf("\nNhap sai phim chuc nang!");
				break;
			}
		}//sw
	}//do
	while (menu!=0);
	return 0;
}//main
