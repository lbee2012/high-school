#include <stdio.h>

int main()
{
	char mssv[10];
	char hoten[30];
	float diem;
	char que[10];
	
	printf("Nhap vao thong tin ca nhan cua ban.\n\n");
	
	printf("Ho va ten: ");
	fgets(mssv,10,stdin);
	
	printf("Ma so sinh vien: ");
	fgets(hoten,30,stdin);
	
	printf("Diem: ");
	scanf("%f",&diem);
	getschar();
	
	printf("Que quan: ");
	fgets(que,10,stdin);
	
	printf("\nHo va ten cua ban: %s.",hoten);
	printf("\nMa so sinh vien cua ban: %s.",mssv);
	printf("\nBan %.1f diem.",diem);
	printf("\nQue cua ban o: %s.",que);
	
	return 0;
}
