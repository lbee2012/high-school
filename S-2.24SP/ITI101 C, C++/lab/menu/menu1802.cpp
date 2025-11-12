#include <stdio.h>
int mot(int x)
{
	if(x > 0)
	printf("\n%d la so nguyen duong.",x);
	
	else if(x == 0)
	printf("\n%d khong phai nguyen duong cung khong phai nguyen am.",x);
	
	else
	printf("\n%d la so nguyen am.",x);
}

int hai(int x)
{
	if(x % 2 == 0)
	printf("\n%d la so chan.",x);
	
	else
	printf("\n%d la so le.",x);
}

int ba(int a,int b,int c)
{
	int max = a;
	
	if(b > max)
	max = b;
	
	if(c > max)
	max = c;
	
	printf("\nSo lon nhat trong ba so %d %d %d la: %d",a,b,c,max);
}

int bon(int a,int b,int c)
{
	int min = a;
	
	if(b < min)
	min = b;
	
	if(c < min)
	min = c;
	
	printf("\nSo nho nhat trong ba so %d %d %d la: %d",a,b,c,min);
}

int nam(int namsinh)
{
	int tuoi;
	
	tuoi = 2024 - namsinh;
	
	printf("\nHien tai, ban dang %d tuoi.",tuoi);
}

int sau(int t,int l, int h)
{
	float dtb;
	dtb = (t + l + h) / 3;
	
	printf("\nDiem trung binh cua ban la: %.2f",dtb);
	
	if(dtb <= 10 && dtb >= 9)
	printf("\nHoc sinh Xuat sac.");
	
	else if(dtb < 9 && dtb >= 8)
	printf("\nHoc sinh Gioi.");
	
	else if(dtb < 8 && dtb >= 6)
	printf("\nHoc sinh Kha.");
	
	else if(dtb < 6 && dtb >= 5)
	printf("\nHoc sinh Trung binh.");
	
	else if(dtb < 5 && dtb >= 0)
	printf("\nHoc sinh Yeu.");
	
	else
	printf("\nHoc sinh ngu.");
}


int main()
{
	int menu;
	do
	{
		printf("\n\nMENU\n\n");
		
		printf("1. So nguyen duong hay khong.\n");
		printf("2. So chan hay so le.\n");
		printf("3. Tim max cua 3 so.\n");
		printf("4. Tim min cua 3 so.\n");
		printf("5. Tinh tuoi.\n");
		printf("6. Tinh diem trung binh.\n");
		printf("7. In cac so le tu 1-n. Dem co bnh so chan tu 0-n.\n\n");
		
		printf("0. Thoat MENU.");
		
		printf("\n\nNhap vao phim chuc nang: ");
		scanf("%d",&menu);
		
		switch (menu)
		{
			case 1:
			{
				printf("\nChuc nang 1: Nhap vao mot so, kiem tra so do co nguyen duong hay khong.\n\n");
				int x;
				
				printf("Nhap vao so X: ");
				scanf("%d",&x);
				
				int trl = mot(x);
				
				break;
			}
			case 2:
			{
				printf("\nChuc nang 2: Nhap vao mot so, kiem tra so do la so chan hay so le.\n\n");
				int x;
				
				printf("Nhap vao so X: ");
				scanf("%d",&x);
				
				int trl = hai(x);
				
				break;
			}
			case 3:
			{
				printf("\nChuc nang 3: Nhap vao 3 so, tim so lon nhat trong 3 so vua nhap.\n\n");
				int a,b,c;
				
				printf("Nhap so thu nhat: ");
				scanf("%d",&a);
				
				printf("Nhap so thu hai: ");
				scanf("%d",&b);
				
				printf("Nhap so thu ba: ");
				scanf("%d",&c);
				
				int kq = ba(a,b,c);
				
				break;
			}
			case 4:
			{
				printf("\nChuc nang 4: Nhap vao 3 so, tim so nho nhat trong 3 so vua nhap.\n\n");
				int a,b,c;
				
				printf("Nhap so thu nhat: ");
				scanf("%d",&a);
				
				printf("Nhap so thu hai: ");
				scanf("%d",&b);
				
				printf("Nhap so thu ba: ");
				scanf("%d",&c);
				
				int kq = bon(a,b,c);
				
				break;
			}
			case 5:
			{
				printf("\nChuc nang 5: Nhap vao nam sinh cua ban, tinh tuoi hien tai cua ban.\n\n");
				int namsinh;
				
				printf("Nhap vao nam sinh cua ban: ");
				scanf("%d",&namsinh);
				
				int kq = nam(namsinh);
				
				break;
			}
			case 6:
			{
				printf("\nChuc nang 6: Nhap vao diem toan, ly, hoa. Tinh diem trung binh va xep loai hsinh.\n\n");
				int t,l,h;
				
				printf("Nhap vao diem toan: ");
				scanf("%d",&t);
				
				printf("Nhap vao diem ly: ");
				scanf("%d",&l);
				
				printf("Nhap vao diem hoa: ");
				scanf("%d",&h);
				
				int kq = sau(t,l,h);
				
				break;
			}
			case 7:
			{
				
			}
			
			case 0:
			{
				printf("\nThoat MENU thanh cong!");
				break;
			}
			default:
			{
				printf("\nBan chon ngu!");
				break;
			}
		}//sw
	}//do
	while (menu != 0);
	return 0;
}//main
