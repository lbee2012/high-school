#include <stdio.h>

struct sv
{
	char ten[30];
	char mssv[30];
	char nganh[30];
	float dtb;
};

int main()
{
	int n,i;
	
	printf("Nhap so sv: ");
	scanf("%d",&n); //n la so sv
	getchar();
	
	struct sv mangsv[n];
	for(i=0;i<n;i++)
	{
	printf("\nNhap ho va ten cua sv%d: ",i+1);
	fgets(mangsv[i].ten,30,stdin);
	
	printf("Nhap ma so sinh vien cua sv%d: ",i+1);
	fgets(mangsv[i].mssv,30,stdin);
	
	printf("Nhap nganh hoc cua sv%d: ",i+1);
	fgets(mangsv[i].nganh,30,stdin);
	
	printf("Nhap diem trung binh cua sv%d: ",i+1);
	scanf("%f",&mangsv[i].dtb);
	getchar();
	}
	
	int j;
	
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(mangsv[i].dtb>mangsv[j].dtb)
			{
				struct sv tg;
				tg=mangsv[i];
				mangsv[i]=mangsv[j];
				mangsv[j]=tg;
			}
		}
	}
	
	printf("\nChuoi sv sau khi sap xep la: ");
	
	for(i=0;i<n;i++)
	{
	printf("\n\nHo va ten cua sv%d la: %s",i+1,mangsv[i].ten);
	printf("Ma so sinh vien cua sv%d la: %s",i+1,mangsv[i].mssv);
	printf("Nganh hoc cua sv%d la: %s",i+1,mangsv[i].nganh);
	printf("Diem trung binh cua sv%d la: %.1f",i+1,mangsv[i].dtb);
	}	
	
	return 0;
}
