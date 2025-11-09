#include <stdio.h>

void mot()
{
	char hoten[30];
	char manv[30];
	float namsinh;
	char quequan[30];
	
	printf("Ho ten nv: ");
	fgets(hoten,30,stdin);
	
	printf("Ma nv: ");
	fgets(manv,30,stdin);
	
	printf("Nam sinh nv: ");
	scanf("%f",&namsinh);
	getchar();
	
	printf("Que quan nv: ");
	fgets(quequan,30,stdin);
	
	printf("\n\nHo va ten cua nv la: %s",hoten);
	printf("Ma nv la: %s",manv);
	printf("Nam sinh cua nv la: %.0f\n",namsinh);
	printf("Que quan cua nv la: %s",quequan);
}

void hai()
{
	char mssv[30];
	float toan,van,hoa;
	
	printf("Ma so sv: ");
	fgets(mssv,30,stdin);
	
	printf("Diem toan: ");
	scanf("%f",&toan);
	getchar();
	
	printf("Diem van: ");
	scanf("%f",&van);
	getchar();
	
	printf("Diem hoa: ");
	scanf("%f",&hoa);
	getchar();
	
	printf("\nMa so sv la: %s",mssv);
	printf("Diem toan cua sv la: %.1f\n",toan);
	printf("Diem van cua sv la: %.1f\n",van);
	printf("Diem hoa cua sv la: %.1f\n",hoa);
}

void ba()
{
	char masp[30];
	char tensp[30];
	float gia;
	
	printf("Ma sp: ");
	fgets(masp,30,stdin);
	
	printf("Ten sp: ");
	fgets(tensp,30,stdin);
	
	printf("Gia thanh sp: ");
	scanf("%f",&gia);
	getchar();
	
	printf("\nMa sp la: %s",masp);
	printf("Ten sp la: %s",tensp);
	printf("Gia thanh cua sp la: %.2f\n",gia);
}

int main()
{
	int menu;
	
	do
	{
	printf("\n\nMENU\n");
	
	printf("\n1. Nhan vien.");
	printf("\n2. Sinh vien.");
	printf("\n3. San pham.");
	
	printf("\n\n0. Thoat MENU");
	
	printf("\n\nNhap vao chuc nang: ");
	scanf("%d",&menu);
	getchar();
	
	switch (menu)
	{
		case 1:
		{
			printf("\n1. Nhan vien.\n\n");
			mot();
			break;
		}
		case 2:
		{
			printf("\n2. Sinh vien.\n\n");
			hai();
			break;
		}
		case 3:
		{
			printf("\n3. San pham.\n\n");
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
			printf("Ban chon ngu!");
			break;
		}
	}//sw
	}//do
	while (menu!=0);
	
	return 0;
}//main
