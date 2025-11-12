#include <stdio.h>
#include <math.h>

int main()
{
	float a,b,c,delta,x,x1,x2;
	
	printf("Nhap vao a: ");
	scanf("%f",&a);
	
	printf("Nhap vao b: ");
	scanf("%f",&b);
	
	printf("Nhap vao c: ");
	scanf("%f",&c);
	
	if(a == 0)
	{
		if(b == 0)
		{
			if(c == 0)
			printf("\nPT vo so nghiem.");
			
			else
			printf("\nPT vo nghiem.");
		}
		else
		{
			x = -b/a;
			printf("\nPT co nghiem x = -b/a = %.1f",x);
		}
	}
	else
	delta = b * b / 4 * a * c;
	{
		if(delta < 0)
		printf("\nPT vo nghiem.");
		
		else if(delta == 0)
		printf("\nPT co nghiem kep x = x1 = x2 = -b/2a = -%.1f/2*%.1f",b,a);
		
		else
		printf("\nPT co 2 nghiem phan biet x1, x2.");
		
		x1 = (-b + sqrt(delta)) / 2 * a;
		x2 = (-b - sqrt(delta)) / 2 * a;
		
		printf("\nx1 = %.2f",x1);
		printf("\nx2 = %.2f",x2);
	}
	return 0;
}
