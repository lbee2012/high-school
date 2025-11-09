#include <stdio.h>
#include <string.h>

void mot()
{
    char hoten[100];
    int namsinh,tuoi;
    char diachi[100];
    char sex[100];

    printf("Ho va ten: ");
    gets(hoten);

    printf("Nam sinh: ");
    scanf("%d",&namsinh);
    
    tuoi=2024-namsinh;

    printf("Dia chi nha: ");
    gets(diachi);

    printf("Gioi tinh: ");
    gets(sex);

    printf("\nHo va ten cua ban la: %s.",hoten);
    printf("\nBan sinh nam %s, hien tai dang %d tuoi.",namsinh,tuoi);
    printf("\nNha ban o %s.",diachi);
    printf("\nBan thuoc gioi tinh %s.",sex);
}
void hai()
{
	float toan,van,anh,dtb;
	
	printf("Nhap vao diem toan: ");
	scanf("%f",&toan);
	
	printf("Nhap vao diem van: ");
	scanf("%f",&van);
	
	printf("Nhap vao diem anh: ");
	scanf("%f",&anh);
	
	dtb=(toan+van+anh)/3;
	
	if(dtb<=10 && dtb>=8)
	printf("\nBan co hoc luc gioi voi diem trung binh = %.2f.",dtb);
	else if(dtb<=8 && dtb>=5)
	printf("\nBan co hoc luc kha voi diem trung binh = %.2f.",dtb);
	else if(dtb<=5 && dtb>=0)
	printf("\nBan co hoc luc trung voi diem trung binh = %.2f.",dtb);
	else
	printf("\nBan xfm lul vi en.");
}
int main()
{
	int menu;
	printf("\n\nMENU\n\n");
	
	printf("1. Thong tin ca nhan.\n");
	printf("2. Tinh diem trung binh.\n");
	printf("3. Thuong tet cua nhan vien.\n");
	
	printf("\n0. Thoat MENU.");
	
	do
	{
	printf("\n\nNhap vao phim chuc nang: ");
	scanf("%d",&menu);
	
	switch(menu)
	{
		case 1:
		{
			printf("\nIn ra thong tin ca nhan cua ban.\n");
			printf("Nhap vao thong tin ca nhan cua ban.\n\n");
			mot();
			break;
		}
		case 2:
		{
			printf("\nTinh diem trung binh, xet hoc luc cua ban.\n");
			printf("Nhap vao diem toan van anh cua ban.\n\n");
			hai();
			break;
		}
		case 3:
		{
			printf("\n")
		}
	}//sw
	}//do
	while(menu!=0);
	return 0;
}//main
