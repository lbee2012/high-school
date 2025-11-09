#include <stdio.h>
void mot()
{
	int x;
	
	for(x=1;x<=50;x++)
	printf("%d\n",x);
}
void hai()
{
	int x;
	int tich=1;
	
	for(x=1;x<=10;x++)
	tich=tich*x;
	
	printf("Tich tu 1-10 la: %d\n",tich);
}
void ba()
{
	int x;
	int tong=0;
	
	for(x=1;x<=20;x++)
	{
	if(x%2!=0)
	tong=tong+x;
	}
	printf("Tong cac so le tu 1-20 la: %d\n",tong);
}
void bon()
{
	int x;
	
	for(x=0;x<=10;x++)
	
	if(x%2==0)
	printf("%d\n",x);
}
int main()
{
	int menu;
	
	do
	{
	printf("\n+---------------------------------------+\n");
	printf("|1. In cac so tu 1-50                   |\n");
	printf("|2. Tinh tich cac so tu 1-10            |\n");
	printf("|3. Tinh tong cac so le tu 1-20         |\n");
	printf("|4. In cac so chan tu 0-10              |\n");
	printf("|5. Thoat MENU                          |\n");
	printf("+---------------------------------------+\n\n");
	
	printf("Xin moi chon chuc nang (1,2,3,4,5): ");
	
	scanf("%d",&menu);
	
	switch (menu)
	{
		case 1:
		{
			printf("\nIn cac so tu 1-50.\n\n");
			mot();
			break;
		}
		case 2:
		{
			printf("\nTinh tich cac so tu 1-10.\n\n");
			hai();
			break;
		}
		case 3:
		{
			printf("\nTinh tong cac so le tu 1-20.\n\n");
			ba();
			break;
		}
		case 4:
		{
			printf("\nIn cac so chan tu 0-10.\n\n");
			bon();
			break;
		}
		case 5:
		{
			printf("\nThoat MENU.");
			break;
		}
		default:
		{
			printf("\nBan bi ngu a`.\n");
			break;
		}
	}
	}
	while(menu!=5);
	
	return 0;
}
