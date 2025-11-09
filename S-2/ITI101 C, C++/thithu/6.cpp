#include <stdio.h>

void mot()
{
	char tenmon[30];
	char mamon[30];
	int tinchi;
	
	printf("Nhap ten mon hoc: ");
	fgets(tenmon,30,stdin);
	
	printf("Nhap ma mon hoc: ");
	fgets(mamon,30,stdin);
	
	printf("Nhap so tin chi: ");
	scanf("%d",&tinchi);
	getchar();
	
	float hocphi = (float)tinchi * 500000.0;
	
	printf("\nMon hoc co ten: %s",tenmon);
	printf("Ma cua mon la: %s",mamon);
	printf("Mon hoc co %d tin chi",tinchi);
	printf("\nTong hoc phi la: %.0f VND",hocphi);
}

int hai(int n)
{
	int i;
	int tong = 0;
	int biendemchiaba = 0;
	int biendemchan = 0;
	
	if(n%2==0)
	printf("\n%d la so chan.",n);
	else
	printf("\n%d la so le.",n);
	
	for(i=1;i<=n;i++)
	{
		tong=tong+i;
		
		if(i%3==0)
		biendemchiaba++;
		
		if(i%2==0)
		biendemchan++;
	}
	printf("\n\nCo %d so chia het cho 3 trong khoang tu 1 den %d.",biendemchiaba,n);
	printf("\nCo %d so chan trong khoang tu 1 den %d.",biendemchan,n);
	printf("\n\nTong cac so tu 1 den %d la: %d",n,tong);
}

void ba()
{
	int n;
	
	printf("Nhap so sv: ");
	scanf("%d",&n);
	
	float mang[n];
	
	int i;
	
	float dtb,tongdiem;
	
	for(i=0;i<n;i++) //for nhap so sv
	{
		printf("Diem cua sv%d la: ",i+1);
		scanf("%f",&mang[i]);
		
		tongdiem = tongdiem + mang[i];
	}
	
	dtb = tongdiem / (float)n;
	
	printf("\nDTB cua cac sivi la: %.2f",dtb);
	
	float max=mang[0];
	int vitri;
	
	for(i=1;i<n;i++)
	{
		if(max<mang[i])
		max=mang[i];
		vitri=i;
	}
	
	printf("\n\nSivi %d co diem cao nhat la: %.1f",vitri,max);
	
	int dem5=0;
	
	for(i=0;i<n;i++)
	{
		if(mang[i]>=5)
		dem5++;
	}
	printf("\n\nSo SV co diem khong duoi 5 la: %d",dem5);
}
int main()
{
	int menu;
	do
	{
		printf("\n\nMENU\n");
		
		printf("\n1. Thong tin mon hoc.");
		printf("\n2. Tinh tong so le.");
		printf("\n3. Thong tin diem Lab.");
		
		printf("\n\n0. Thoat MENU.");
		
		printf("\n\nMoi chon chuc nang: ");
		scanf("%d",&menu);
		getchar();
		
		switch(menu)
		{
			case 1:
			{
				printf("\nChuc nang 1.\n\n");
				
				mot();
				
				break;
			}
			case 2:
			{
				printf("\nChuc nang 2.\n\n");
				
				int n;
				
				printf("Nhap vao so nguyen N: ");
				scanf("%d",&n);
				
				int kqtrl = hai(n);
				
				break;
			}
			case 3:
			{
				printf("\nChuc nang 3.\n\n");
				
				ba();
				
				break;
			}
			case 0:
			{
				printf("\nThoat MENU thanh cong!.");
				break;
			}
			default:
			{
				printf("\nBan chon ngu!.");
				break;
			}
		} //sw
	} //do
	while (menu!=0);
	return 0;
} //main
