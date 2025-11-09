#include <stdio.h>
#include <string.h>


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
	scanf("%d",&n); //so sv
	getchar();
	
	struct sv mangsv[n];
	for(i=0;i<n;i++)
	{
	printf("\nHo va ten sv%d la: ",i+1);
	fgets(mangsv[i].ten,30,stdin);
	
	printf("Ma so sv%d la: ",i+1);
	fgets(mangsv[i].mssv,30,stdin);
	
	printf("Nganh hoc sv%d la: ",i+1);
	fgets(mangsv[i].nganh,30,stdin);
	
	printf("Diem sv%d la: ",i+1);
	scanf("%f",&mangsv[i].diem);
	getchar();
	}
	
	char mssv[30];
	printf("\nTim kiem bang ma so sinh vien: ");
	fgets(mssv,30,stdin);
	
	for(i=0;i<n;i++)
	{
		if(strcmp(mssv,mangsv[i].mssv)==0)
		{
		printf("\nHo ten sv%d la: %s",i+1,mangsv[i].ten);
		printf("Ma so sv%d la: %s",i+1,mangsv[i].mssv);
		printf("Nganh sv%d la: %s",i+1,mangsv[i].nganh);
		printf("Diem sv%d la: %.1f",i+1,mangsv[i].diem);
		}
	}
	
	return 0;
}
