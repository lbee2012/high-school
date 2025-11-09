#include <stdio.h>

struct sv
{
	char ten[30];
	char mssv[30];
	char nganh[30];
	float diem;
};

int main()
{
	int n,i;
	
	printf("Nhap so sv: ");
	scanf("%d",&n);
	getchar();
	
	struct sv a1[n];
	for(i=0;i<n;i++)
	{
	printf("Nhap ho ten cua sv%d: ",i+1);
	fgets(a1[i].ten,30,stdin);
	
	printf("Nhap ma so sinh vien cua sv%d: ",i+1);
	fgets(a1[i].mssv,30,stdin);
	
	printf("Nhap nganh hoc cua sv%d: ",i+1);
	fgets(a1[i].nganh,30,stdin);
	
	printf("Nhap diem trung binh cua sv%d: ",i+1);
	scanf("%f",&a1[i].diem);
	getchar();
	}
	printf("\n\nHo va ten cua sv1 la: %s",a1[i].ten);
	printf("Ma so sinh vien cua sv1: %s",a1[i].mssv);
	printf("Nganh hoc cua sv1 la: %s",a1[i].nganh);
	printf("Diem trung binh cua sv1 la: %.1f",a1[i].diem);
	
	return 0;
}
