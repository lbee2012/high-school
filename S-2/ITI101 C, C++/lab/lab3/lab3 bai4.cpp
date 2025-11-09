#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void hocluc()
{
	float dtb;
	
	printf("Nhap vao dtb: ");
	scanf("%f",&dtb);
	
	if(dtb<=10 && dtb>= 9)
	printf("Hoc luc xuat sac");
	
	else if(dtb>=8)
	printf("Hoc luc gioi");
	
	else if(dtb>=6.5)
	printf("Hoc luc kha");

	else if(dtb>=5)
	printf("Hoc luc trung binh");
	
	else if(dtb>=3.5)
	printf("Hoc luc yeu");
	
	else
	printf("Hoc luc kem");
	
	return 0;
}
void ptb1()
{
	float a,b,x;
	
	printf("Nhap vao a: ");
	scanf("%f",&a);
	
	printf("Nhap vao b: ");
	scanf("%f",&b);
	
	if(a==0)
	{
		if(b==0)
		{
			printf("PT vo so nghiem");
		}
		else
		{
			printf("PT vo nghiem");
		}
	}
	else
	{
		x = -b/a;
		printf("PT co nghiem x = %f",x);
	}
	return 0;
}
void ptb2()
{
	float a,b,c,delta,x,x1,x2;
	
	printf("Nhap vao a: ");
	scanf("%f",&a);
	
	printf("Nhap vao b: ");
	scanf("%f",&b);
	
	printf("Nhap vao c: ");
	scanf("%f",&c);
	
	if(a==0)
	{
		if(b==0)
		{
			if(c==0)
			printf("PT vo so nghiem");
			
			else
			printf("PT vo nghiem");
		}
		else
		{
			x = -b/a;
			printf("PT co nghiem x = %1.f",x);
		}
	}
	else
	{
		delta = b*b - 4*a*c;
		if(delta<0)
		printf("PT vo nghiem");
		
		else if(delta==0)
		printf("PT co nghiem kep x = %.1f = %.1f = -%.1f/(2*%.1f)",x1,x2,b,a);
		
		else
		{
			x1 = (-b + sqrt(delta))/(2*a);
			x2 = (-b - sqrt(delta))/(2*a);
			printf("PT co 2 nghiem x1 = %.1f, x2 = %.1f",x1,x2);
		}
	}
	return 0;
}
void tiendien()
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
	
	a = 83900;
	b = 86700;
	c = 201400;
	d = 253600;
	e = 292700;
	
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
	printf("So tien dien la: %f",y);
}
int main() 
{	
	int x;
	
	printf("===== MENU LUA CHON =====\n\n");
	
	printf("1. Tinh hoc luc - Lab3 bai 1.\n");
	printf("2. Giai phuong trinh bac nhat - Lab3 bai 2.1.\n");
	printf("3. Giai phuong trinh bac hai - Lab3 bai 2.2.\n");
	printf("4. Chuong trinh tinh tien dien - Lab3 bai 3.\n");
	
	printf("0. THOAT CHUONG TRINH!\n\n");
	
	printf("Lua chon cua ban la (0,1,2,3,4): ");
	scanf("%d",&x);

	switch(x)
	{
		case 0:
			break;
		
		case 1:
		{
			printf("Ban da lua chon ham tinh hoc luc.\n");
			hocluc();
			break;
		}
		case 2:
		{
			printf("Ban da lua chon ham tinh ptb1.\n");
			ptb1();
			break;
		}
		case 3:
		{
			printf("Ban da lua chon ham tinh ptb2.\n");
			ptb2();
			break;
		}
		case 4:
		{
			printf("Ban da lua chon ham tinh tien dien.\n");
			tiendien();
			break;
		}
		default:
		{
			printf("Ban chon ngu.");
			break;
		}
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
