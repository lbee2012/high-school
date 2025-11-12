#include <stdio.h>

int main()
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
	
	return 0;
}
