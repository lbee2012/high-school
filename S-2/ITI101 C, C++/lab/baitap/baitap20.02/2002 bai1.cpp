#include <stdio.h>

int main()
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
	
	return 0;
}
