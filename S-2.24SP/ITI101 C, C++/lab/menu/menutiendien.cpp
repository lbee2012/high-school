#include <stdio.h>
void mot()
{
	int a,b;
	float x;
	
	printf("Nhap vao a: ");
	scanf("%d",&a);
	
	printf("Nhap vao b: ");
	scanf("%d",&b);
	
	x = (float)-b / (float)a;
	
	printf("\nPhuong trinh bac 1: %.0fx + %.0f = 0 co nghiem x = %.2f \n\n",(float)a,(float)b,x);
}
void hai()
{
	int n;
	int tong=0;
	int biendem=0;
	printf("Nhap n: ");
	scanf("%d",&n);
	

}
void ba()
{
	float a,b,c,d,e,x,y;
	
	const float money1 = 1678;
	const float money2 = 1734;
	const float money3 = 2014;
	const float money4 = 2536;
	const float money5 = 2834;
	const float money6 = 2927;
	
	const float min = 0;
	const float max1 = 50;
	const float max2 = 100;
	const float max3 = 200;
	const float max4 = 300;
	const float max5 = 400;
	
	a = 83900; //0 den 50
	b = 86700; //50 den 100
	c = 201400; //100 den 200
	d = 253600; //200 den 300
	e = 292700; //300 den 400
	
	printf("Nhap vao so dien: ");
	scanf("%f",&x);
	
	if(x>=0 && x<=50)
		y = money1*x;
	else if(x>=51 && x<=100)
		y = a+((x-max1)*money2);
	else if(x>=101 && x<=200)
		y = a+b+((x-max2)*money3);
	else if(x>=201 && x<=300)
		y = a+b+c+((x-max3)*money4);
	else if(x>=301 && x<=400)
		y = a+b+c+d+((x-max4)*money5);
	else
	{
		y = a+b+c+d+e+((x-max5)*money6);
	}
	printf("\nSo tien dien la: %f\n\n",y);
}
int main()
{
	int menu;
	
	do
	{
	printf("=== MENU ===\n\n");
	
	printf("1. Tinh phuong trinh bac 1.\n");
	printf("2. Tinh tong tu 1 den n.\n");
	printf("3. Tinh tien dien.\n");
	printf("4. Thoat MENU.\n\n");
	
	printf("Lua chon cua ban la (1,2,3,4): ");
	scanf("%d",&menu);
	
	switch(menu)
	{
		case 1:
		{
			printf("\nTinh phuong trinh bac 1.\n\n");
			mot();
			break;
		}
		case 2:
		{
			printf("\nTinh tong tu 1 den n.\n\n");
			hai();
			break;
		}
		case 3:
		{
			printf("\nTinh tien dien.\n\n");
			ba();
			break;
		}
		case 4:
		{
			printf("\nThoat MENU thanh cong.");
			break;
		}
		default:
		{
			printf("Ban chon ngu.");
			break;
		}
	}
	
	
	
	}
	while(menu!=4);
	
	return 0;
}
