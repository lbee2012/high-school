#include <stdio.h>
#include <string.h>

int main()
{
	char ttcn[100];
	
	char mssv[100];
	char hoten[100];
	char tuoi[100];
	char diachi[100];
	char nganh[100];
	
	printf("Nhap vao thong tin ca nhan cua ban.\n\n");
	
	printf("Ma so sinh vien: ");
	gets(mssv);
	
	printf("Ho va ten: ");
	gets(hoten);
	
	printf("Tuoi: ");
	gets(tuoi);
	
	printf("Dia chi nha: ");
	gets(diachi);
	
	printf("Nganh hoc: ");
	gets(nganh);
	
	printf("\nMa so sinh vien cua ban: %s.",mssv);
	printf("\nHo va ten cua ban: %s.",hoten);
	printf("\nBan %s tuoi.",tuoi);
	printf("\nDia chi nha cua ban: %s.",diachi);
	printf("\nNganh ban hoc la: %s.",nganh);
	
	return 0;
}//main

