#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) 
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
	return 0;
}
